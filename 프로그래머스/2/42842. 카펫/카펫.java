import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
/*
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
        }*/
        int num = brown+yellow;
        for(int i=1; i<brown;i++){
            int a = yellow/i;
            int sum = (a+2)*(i+2);
            if(sum==num&&yellow%i==0){
                answer[0]=Math.max(a+2,i+2);
                answer[1]=Math.min(a+2,i+2);
                break;
            }
        }
        return answer;
    }
}