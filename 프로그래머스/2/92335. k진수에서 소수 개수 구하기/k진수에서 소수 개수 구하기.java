class Solution {
    public int solution(int n, int k) {
        int answer = 0; //소수검사 확인해보기
        if(n==1) return 0;
        String s = Integer.toString(n,k);
        String[] str = s.split("0");
        for(int i=0; i<str.length; i++){
            if(!str[i].isEmpty()){
                long num = Long.parseLong(str[i]);
                if(cal(num)){
                    answer++;
                }
            }
        }
        return answer;
    }
    public boolean cal(long n){
        if(n<2) return false;
        for(long i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}