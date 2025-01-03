class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int n = gcd(a,b);
        b=b/n;
        while(b%2==0){
            b=b/2;
        }
        while(b%5==0){
            b=b/5;
        }
        if(b==1) answer=1;
        return answer;
    }
    private int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}