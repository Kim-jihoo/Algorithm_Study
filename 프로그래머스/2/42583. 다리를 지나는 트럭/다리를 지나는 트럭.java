import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int time =0;
        int total =0;
        int truck =0;
        
        for(int i=0; i<bridge_length; i++){
            queue.add(0);
        }
       
        while(!queue.isEmpty()){
            time++;
            total-=queue.poll();
            if(truck<truck_weights.length){
                if(total+truck_weights[truck]<=weight){
                    queue.add(truck_weights[truck]);
                    total+=truck_weights[truck];
                    truck++;
                }else{
                    queue.add(0);
                }
            }
        }
        
        
        return time;
    }
}