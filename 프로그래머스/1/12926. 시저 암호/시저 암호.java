class Solution {
    public String solution(String s, int n) {
      
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch==' '){
                answer.append(' ');
            }else if(ch>='a'&&ch<='z'){
                answer.append((char)((ch-'a'+n)%26+'a'));
            }else{
                answer.append((char)((ch-'A'+n)%26+'A'));
            }
        }
        return answer.toString();
    }
}