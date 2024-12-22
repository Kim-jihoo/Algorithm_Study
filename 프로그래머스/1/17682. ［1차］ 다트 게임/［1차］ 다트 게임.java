import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int answer=0;
        int idx = -1; // 점수 배열의 인덱스

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            // 점수 판별 (0~9 또는 10 처리)
            if (Character.isDigit(ch)) {
                idx++; // 새로운 점수 시작
                if (ch == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    scores[idx] = 10; // 10 처리
                    i++;
                } else {
                    scores[idx] = ch - '0'; // 정수 변환
                }
            } else if (ch == 'S') {
                // Single: 1제곱 (그대로)
            } else if (ch == 'D') {
                // Double: 2제곱
                scores[idx] = (int) Math.pow(scores[idx], 2);
            } else if (ch == 'T') {
                // Triple: 3제곱
                scores[idx] = (int) Math.pow(scores[idx], 3);
            } else if (ch == '*') {
                // 스타상: 현재 점수와 이전 점수를 2배로
                scores[idx] *= 2;
                if (idx > 0) {
                    scores[idx - 1] *= 2;
                }
            } else if (ch == '#') {
                // 아차상: 현재 점수를 음수로
                scores[idx] *= -1;
            }
        }

        answer=scores[0]+scores[1]+scores[2];
        return answer;
    }
}
