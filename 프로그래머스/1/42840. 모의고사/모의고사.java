import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int [] a1 = {1,2,3,4,5};
        int [] a2 = {2,1,2,3,2,4,2,5};
        int [] a3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i=0; i<answers.length; i++){
            
            if(answers[i]==a1[i%a1.length]){
                    answer[0]+=1;
           }
            if(answers[i]==a2[i%a2.length]){
                    answer[1]+=1;
           }
             if(answers[i]==a3[i%a3.length]){
                    answer[2]+=1;
           }
        }
        int maxScore = Math.max(answer[0],Math.max(answer[1],answer[2]));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(answer[i]==maxScore){
                list.add(i+1);
            }
        }
        int [] arr= new int[list.size()];
        for(int i=0; i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}