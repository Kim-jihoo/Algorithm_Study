class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] str = s.split("");
        char[] ch = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            answer[i]=-1;
            for(int j=0; j<=i-1; j++){
                if(str[i].equals(str[j])){
                    answer[i]=i-j;
                }
            }
        }
        return answer;
    }
}