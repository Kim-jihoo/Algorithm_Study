class Solution {
    public int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev2 = 0, prev1 = 1; // 이전 두 값
        for (int i = 2; i <= n; i++) {
            int current = (prev1 + prev2) % 1234567;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
