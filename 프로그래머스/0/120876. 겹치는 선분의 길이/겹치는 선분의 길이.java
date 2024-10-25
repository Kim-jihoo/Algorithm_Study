import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
       
        int[] interval = new int[201];
        for(int[] line : lines){
            int start = line[0]+100;
            int end = line[1]+100;
            for(int i=start; i<end; i++){
                interval[i]++;
            }
        }
        for(int i=0; i<201; i++){
            if(interval[i]>=2){
                answer++;
            }
        }
        return answer;
    }
}