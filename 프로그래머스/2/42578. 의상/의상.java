import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        /* n+1 m+1 k+1
        ArrayList -> [1 ,2 ,3] length *a[i]+1
        */
        int answer = 1;
        HashMap<String, Integer> clo = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            clo.put(clothes[i][1], clo.getOrDefault(clothes[i][1],0)+1);
        }
        for(String key : clo.keySet()){
            if(clo.get(key)!=0){
                answer *= (clo.get(key)+1);
            }
        }
        answer -=1;
        return answer;
    }
}