import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        
        int[] answer = new int[score.length];
        Double [][] n = new Double[score.length][2];
        
        for(int i=0; i<score.length;i++){
            Double average = (score[i][0]+score[i][1])/2.0;
            n[i][0] = average;
            n[i][1]=(double)i;
        }
        Arrays.sort(n,(a,b)->b[0].compareTo(a[0]));

        int rank =1;
        for(int i=0; i<score.length; i++){
            if(i>0&&!n[i][0].equals(n[i-1][0])){
                rank=i+1;
            }
            
            answer[(int)(n[i][1]).doubleValue()] = rank;
        }
        return answer;
    }
}