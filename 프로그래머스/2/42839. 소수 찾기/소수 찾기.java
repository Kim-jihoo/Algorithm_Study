import java.util.*;
class Solution {
    public static Set<Integer> set;
    public static boolean[] visit;
    public int solution(String numbers) {
        int answer = 0;
        set = new HashSet<>();
        visit = new boolean[numbers.length()];
       
          dfs(numbers,"",0);
        for(int key: set){
            if(isPrime(key)){
                answer++;
            }
        };
        return answer;
    }
    public static void dfs(String numbers, String str, int depth){
        if(!str.isEmpty()){
            set.add(Integer.parseInt(str));
        }
        if(depth==numbers.length()){
            return;
        }
        String[] s = numbers.split("");
        for(int i=0; i<s.length;i++){
            if(!visit[i]){
                visit[i]=true;
                dfs(numbers,str+s[i],depth+1);
                visit[i]=false;
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    };
}