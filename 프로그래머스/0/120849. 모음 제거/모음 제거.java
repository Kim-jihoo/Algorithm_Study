class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch [] = my_string.toCharArray();
        for(int i=0; i<ch.length; i++){
            String str[] = my_string.split("");
            if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'){
                answer+=str[i];
            }
        }
        return answer;
    }
}