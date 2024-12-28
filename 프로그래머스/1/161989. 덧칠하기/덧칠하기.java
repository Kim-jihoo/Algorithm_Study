class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int end = 0; // 롤러가 마지막으로 칠한 범위의 끝 지점

        for (int sec : section) {
            if (sec > end) { // 현재 구역이 마지막으로 칠한 범위를 벗어난 경우
                answer++;
                end = sec + m - 1; // 새로운 롤러 범위를 설정
            }
        }

        return answer;
    }
}
