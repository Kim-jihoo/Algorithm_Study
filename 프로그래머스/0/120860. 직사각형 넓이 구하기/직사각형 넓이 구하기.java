import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }else{
                return a[1]-b[1];
            }
        });
        int a = Math.abs(dots[1][1]-dots[0][1]);
        int b= Math.abs(dots[3][0]-dots[1][0]);
        answer=a*b;
        return answer;
    }
}