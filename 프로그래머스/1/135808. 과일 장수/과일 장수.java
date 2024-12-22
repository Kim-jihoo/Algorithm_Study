import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 사과 점수를 내림차순으로 정렬
        Arrays.sort(score);
        int length = score.length;

        // 뒤에서부터 m개씩 그룹을 만들어 최소 점수를 기준으로 가격 계산
        for (int i = length - m; i >= 0; i -= m) {
            answer += score[i] * m; // 그룹의 최소 점수 * m
        }

        return answer;
    }
}
