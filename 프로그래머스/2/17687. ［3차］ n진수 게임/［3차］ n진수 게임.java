class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int num=0;
        while(sb.length()<m*t){
            sb.append(cal(num,n));
            num++;
        }
        for(int i=0; i<t; i++){
            answer.append(sb.charAt((p - 1) + i * m));
        }
        return answer.toString();
    }
    public String cal(int num, int n){
        StringBuilder sb = new StringBuilder();
        if(num==0) return "0";
        while(num!=0){
            if(num%n>9){
                sb.append((char)('A'+num%n-10));
            }else{
                sb.append(num%n);
            }
            num/=n;
        }
        return sb.reverse().toString();
    }
}