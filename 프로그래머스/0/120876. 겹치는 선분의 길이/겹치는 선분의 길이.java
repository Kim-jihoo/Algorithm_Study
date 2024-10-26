import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        for(int i=0; i<3; i++){
            lines[i][0]+=100;
            lines[i][1]+=100;
        }
        Arrays.sort(lines,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }else{
                return a[1]-b[1];
            }
        });
        int start = lines[0][0];
        int end = lines[0][1];
        int length = 0;
        for(int i=1; i<3; i++){
            if(end>lines[i][0]){
                answer +=Math.min(end,lines[i][1])-Math.max(lines[i][0], start);
                int a = Math.max(end,lines[i][0]);
                int b = lines[i][1];
                start = Math.min(a,b);
                end = Math.max(a,b);
            }else{
                start = lines[i][0];
                end = lines[i][1];
            }
        }
        return answer;
    }
}