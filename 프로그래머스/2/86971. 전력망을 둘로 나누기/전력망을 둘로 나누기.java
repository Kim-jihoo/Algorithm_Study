import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int minDifference = Integer.MAX_VALUE;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] wire:wires){
            int a=wire[0];
            int b = wire[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for(int[] wire:wires){
            int a = wire[0];
            int b=wire[1];
            
            graph.get(a).remove((Integer) b);
            graph.get(b).remove((Integer) a);
            
            int count1 = bfs(1,graph,n);
            int count2 = n-count1;
            
            minDifference = Math.min(minDifference,Math.abs(count1-count2));
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return minDifference;
    }
    private int bfs(int start, List<List<Integer>> graph, int n){
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start]=true;
        int count=1;
        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int next : graph.get(node)){
                if(!visited[next]){
                    visited[next]=true;
                    queue.offer(next);
                    count++;
                }
            }
        }
        return count;
    }
}