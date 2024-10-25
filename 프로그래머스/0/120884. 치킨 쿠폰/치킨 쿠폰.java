class Solution {
    public int solution(int chicken) {
        int n = chicken/10; //108
        int k = chicken%10; //1
        int answer =n; //108
        while(k+n>=10){
            int nk = (k+n)/10;
            answer +=nk;
            k=(n+k)%10; n=nk; //1+8 , 10
            
        }

        return answer;
    }
}