import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Queue<Integer> queue = new LinkedList<>();
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length;i++){
            queue.add(prices[i]);
        }
        for(int i=0;i<prices.length;i++){
            answer[i]=0;
            int a = queue.poll();
            for(int j=i+1; j<prices.length;j++){
                 answer[i]+=1;
                if(prices[j]>=a){
                   // answer[i]+=1;
                    
                }else break;
            }
            
            
            
        }
        
        return answer;
    }
}