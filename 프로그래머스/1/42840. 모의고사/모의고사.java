import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int [] pattern1 = {1,2,3,4,5};
        int[] pattern2 = {2,1,2,3,2,4,2,5};
        int [] pattern3 = {3,3,1,1,2,2,4,4,5,5};
        int a=0, b=0, c=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==pattern1[i%pattern1.length]) a++;
            if(answers[i]==pattern2[i%pattern2.length]) b++;
            if(answers[i]==pattern3[i%pattern3.length]) c++;
        }
        int maxScore = Math.max(a,Math.max(b,c));
        ArrayList<Integer> list = new ArrayList<>();
        if(a==maxScore) list.add(1);
        if(b==maxScore) list.add(2);
        if(c==maxScore) list.add(3);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}