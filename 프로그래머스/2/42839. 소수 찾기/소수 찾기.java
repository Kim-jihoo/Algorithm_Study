import java.util.*;
class Solution {
    public static HashSet<Integer> set;
    public static boolean visited[];
    public int solution(String numbers) {
        int answer = 0;
        set=new HashSet<>();
        visited=new boolean[numbers.length()];
        dfs(numbers,"",0);
        for(int key: set){
            if(isPrime(key)){
                answer++;
            }
        }
        return answer;
    }
    public void dfs(String numbers, String s, int depth){
        if(!s.isEmpty()){
            set.add(Integer.parseInt(s));
        }
        if(depth==numbers.length()){
            return;
        }
        
        String [] str =numbers.split("");
        for(int i=0; i<str.length;i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(numbers,s+str[i],depth+1);
                visited[i]=false;
            }
        }
    }
    public boolean isPrime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }}
        return true;
    }
}