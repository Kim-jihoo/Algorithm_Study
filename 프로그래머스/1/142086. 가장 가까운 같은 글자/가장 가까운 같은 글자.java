class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String [] str = s.split("");
        answer[0]=-1;
        for(int i=1; i<s.length();i++){
            answer[i]=-1;
            for(int j=0; j<i; j++){
                if(str[i].equals(str[j])){
                    answer[i]=i-j;
                    
                }
            }
        }
        return answer;
    }
}