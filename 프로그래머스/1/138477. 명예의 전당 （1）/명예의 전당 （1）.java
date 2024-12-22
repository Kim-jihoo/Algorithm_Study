import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            minHeap.add(score[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
            answer[i]=minHeap.peek();
        }
        return answer;
    }
}