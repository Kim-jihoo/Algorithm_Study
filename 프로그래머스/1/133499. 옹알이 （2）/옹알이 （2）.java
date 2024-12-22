class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        
        for(int i=0; i<babbling.length; i++){
            String word = babbling[i];
             if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
                continue;
            }
            if (word.matches("^(aya|ye|woo|ma)+$")) {
                answer++;
            }
        }
        
        return answer;
    }
}