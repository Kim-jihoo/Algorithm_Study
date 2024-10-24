import java.util.Arrays;
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
        double x1 = (double)dots[0][0];
        double y1 = (double)dots[0][1];
        double x2 = (double)dots[1][0];
        double y2 = (double)dots[1][1];
        double x3 = (double)dots[2][0];
        double y3 = (double)dots[2][1];
        double x4 = (double)dots[3][0];
        double y4 = (double)dots[3][1];
        if((y2-y1)/(x2-x1)==(y4-y3)/(x4-x3)){
            answer++;
        }else if((y4-y2)/(x4-x2)==(y3-y1)/(x3-x1)){
            answer++;
        }
                

        return answer;
    }
}