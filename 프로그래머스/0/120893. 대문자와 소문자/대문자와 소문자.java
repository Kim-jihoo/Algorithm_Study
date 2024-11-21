class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str[] = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(Character.isUpperCase(str[i].charAt(0))){
                answer+=str[i].toLowerCase();
            }else{
                answer+=str[i].toUpperCase();
            }
        }
        return answer;
    }
}