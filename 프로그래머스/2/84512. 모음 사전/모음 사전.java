class Solution {
    public int solution(String word) {
        int answer = word.length();
        int[] weights={781, 156, 31, 6, 1};
        char[] v = {'A','E','I','O','U'};
        int idx = 0;
        for(int i=0; i<word.length();i++){
            for(int j=0; j<5;j++){
                if(word.charAt(i)==v[j]){
                    idx=j;
                    break;
                }
            }
            answer+=idx*weights[i];
        }
        return answer;
    }
}