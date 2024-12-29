import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> set = new HashSet<>(Arrays.asList(report)); // 중복 신고 제거
        HashMap<String, Integer> map = new HashMap<>(); // 신고 횟수
        HashMap<String, List<String>> reporters = new HashMap<>(); // 수정: 각 사용자를 신고한 사람들

        // 신고 횟수와 신고자 정보 저장
        for (String entry : set) {
            String[] str = entry.split(" ");
            String reporter = str[0]; // 신고자
            String reported = str[1]; // 신고당한 사람

            map.put(reported, map.getOrDefault(reported, 0) + 1); // 신고 횟수 저장

            // 신고자 목록 추가
            reporters.putIfAbsent(reported, new ArrayList<>());
            reporters.get(reported).add(reporter); // 수정: 신고자 리스트에 추가
        }

        // 정지된 사용자 확인 및 메일 수 계산
        for (String reported : map.keySet()) {
            if (map.get(reported) >= k) { // 정지된 사용자
                for (String reporter : reporters.get(reported)) { // 수정: 정지된 사용자를 신고한 사람 목록 확인
                    int index = Arrays.asList(id_list).indexOf(reporter);
                    answer[index]++;
                }
            }
        }

        return answer;
    }
}
