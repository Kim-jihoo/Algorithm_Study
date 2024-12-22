class Solution {
    public int solution(String s) {
        int answer = 0;
        int n=1;
        int m=0;
        
        char a = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            if(a==ch){
                    n++;
                }else{
                    m++;
                }
           
            if(n==m){
                n=0;m=0;answer++;
                if(i+1<s.length()){
                    a=s.charAt(i+1);
                }
            }
        }
        if(n>0||m>0){
            answer++;
        }
        return answer;
    }
}