class Solution {
    public long solution(long n) {
        long answer = -1;
        long a= (long)Math.sqrt(n);
        if(a*a==n){
            answer=(a+1)*(a+1);
        }
        return answer;
    }
}