import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        /*  
            y 1줄 -> b=2+2*(y+2) // y+2,3
            y n줄(짝) -> b=2*((y/n)+2)+2*n // y/n+2,n+2
            y n줄(홀) -> b=(y/n+2)*(n+2)-y //y/n+2, n+2
            b+y=(y/n+2)(n+2);
            00000
            00000
            00000
            00000
        */
        int a = brown+yellow;
        
        for(int i=1; i<a; i++){
            if((a==((yellow/i+2)*(i+2))&&yellow%i==0)){
                answer[0]=yellow/i+2;
                answer[1]=i+2;
            }
        }
        if(answer[1]>answer[0]){
            int temp=answer[1];
            answer[1]=answer[0];
            answer[0]=temp;
        }
        return answer;
    }
}