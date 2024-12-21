class Solution {
    public String solution(String s) {
        String answer = "";

        int n=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(n%2==0){
                answer+=Character.toUpperCase(ch);
                
            }else{
                answer+=Character.toLowerCase(ch);
            }
            n++;
            if(ch==' '){
                n=0;
            }
        }
        return answer;
    }
}