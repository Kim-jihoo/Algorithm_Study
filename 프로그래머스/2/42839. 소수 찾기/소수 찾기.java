import java.util.*;
class Solution {
    private Set<Integer> numberSet = new HashSet<>();
    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers, "", visited);
        int primeCount=0;
        for(int num : numberSet){
            if(isPrime(num)){
                primeCount++;
            }
        }
        return primeCount;
        
    }

     private void dfs(String numbers, String current, boolean[] visited){
        if(!current.isEmpty()){
            numberSet.add(Integer.parseInt(current));
        }
        for(int i=0; i<numbers.length();i++){
            if(!visited[i]){
            visited[i] =true;
            dfs(numbers, current+numbers.charAt(i), visited);
            visited[i]=false;
            }
        }
    }
    private boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}