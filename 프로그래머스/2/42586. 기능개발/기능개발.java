import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> day = new LinkedList<>();
        
        for(int i=0; i<progresses.length;i++){
            int daysLeft = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0){
                daysLeft++;
            }
            day.add(daysLeft);
        }
        int cur = day.poll();
        int count=1;
        while(!day.isEmpty()){
            int next = day.poll();
            if(next<=cur){
                count++;
            }else{
                result.add(count);
                cur=next;
                count=1;
            }
        }
        result.add(count);
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}