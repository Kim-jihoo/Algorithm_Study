class Solution {
    public int solution(int n) {
        // 소수를 판별할 배열
        boolean[] isPrime = new boolean[n + 1];
        // 초기값: 모든 숫자를 소수로 가정
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // 배수는 소수가 아님
                }
            }
        }

        // 소수 개수 계산
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
