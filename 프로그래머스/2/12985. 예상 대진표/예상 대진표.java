import java.util.*;
class Solution {
    public int solution(int n, int a, int b) {
        // a, b 정렬
        int lower = Math.min(a, b);
        int upper = Math.max(a, b);
        a = lower;
        b = upper;

        return game(1, a, b);
    }

    public int game(int num, int a, int b) {
        // 대결 조건: a와 b가 연속적이고 a가 홀수일 때
        if ((a + 1 == b) && (a % 2 == 1)) {
            return num;
        }
        // 다음 라운드로 이동
        return game(num + 1, (a + 1) / 2, (b + 1) / 2);
    }
}
