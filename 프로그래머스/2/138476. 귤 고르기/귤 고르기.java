import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
        }
        int idx =0;
        int[][] num = new int[tangerine.length][2];
        for(int key : map.keySet()){
            num[idx][0] = key;
            num[idx][1] = map.get(key);
            idx++;
        }
        Arrays.sort(num,(a,b)->{
            if(a[1]!=b[1]){
                return b[1]-a[1];
            }else{
                return a[0]-b[0];
            }
        });
        int n=0;
        while(n<k){
            n+=num[answer][1];
            answer++;
        }
        return answer;
    }
}