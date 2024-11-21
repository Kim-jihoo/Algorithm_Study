class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        String s [] = str.split("");
        for(int i=0; i<s.length; i++){
            if(s[i].equals("3")||s[i].equals("6")||s[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}