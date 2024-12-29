class Solution {
    public int solution(int n, int k) {
        if (n == 1) return 0;
        
        int answer = 0;

        // 1. n을 k진수로 변환
        String kBase = convertToBase(n, k);

        // 2. 0을 기준으로 split
        String[] parts = kBase.split("0");

        // 3. 각 부분이 소수인지 확인
        for (String part : parts) {
            if (!part.isEmpty()) { // 빈 문자열 무시
                long num = Long.parseLong(part);
                if (isPrime(num)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    // 진법 변환 메서드
    private String convertToBase(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }
        return sb.reverse().toString();
    }

    // 소수 판별 메서드
    private boolean isPrime(long num) {
        if (num < 2) return false; // 0과 1은 소수가 아님
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // 나누어 떨어지면 소수가 아님
        }
        return true; // 나누어 떨어지지 않으면 소수
    }
}
