import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int n = score.length;
        int start=n-m;
        while(start>=0){
            if(score[start]<=k){
                answer+=m*score[start];
            }else{
                answer+=m*k;
            }
            start-=m;
        }
        return answer;
    }
}