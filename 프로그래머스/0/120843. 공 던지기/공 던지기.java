import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num=0;
        int count =0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numbers.length; i++){
            queue.add(numbers[i]);
        }
        
        while(true){
            if(num==k) break;
            int a = queue.poll();
            count++;
            if(count%2==1){
                answer=a;
                num++;
            }
            queue.add(a);
        }
        return answer;
    }
}