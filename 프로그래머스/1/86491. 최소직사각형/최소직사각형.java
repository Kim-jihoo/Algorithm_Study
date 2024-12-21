import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        Arrays.sort(sizes,(a,b)->{
            if(a[0]!=b[0]){
                return b[0]-a[0];
            }else{
               return b[1]-a[1];
            }
        });
        int x=sizes[0][0]; int y=sizes[0][1];
        for(int i=1; i<sizes.length; i++){
            if(x<sizes[i][1]){
                x=sizes[i][1];
                y=Math.max(y,sizes[i][0]);
            }else{
                int a = Math.min(sizes[i][0],sizes[i][1]);
                y=Math.max(y,a);
            }
        }
        answer=x*y;
        return answer;
    }
}