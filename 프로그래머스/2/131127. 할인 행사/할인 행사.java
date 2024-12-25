import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<want.length;i++){
            map.put(want[i],number[i]);
        }
        Map<String, Integer> windowMap = new HashMap<>();
        for(int i=0; i<10; i++){
            windowMap.put(discount[i],windowMap.getOrDefault(discount[i],0)+1);
        }
        if(isValid(map, windowMap)){
            answer++;
        }
        
        for(int i=10; i<discount.length; i++){
            String prev = discount[i-10];
            windowMap.put(prev, windowMap.get(prev)-1);
            if(windowMap.get(prev)==0){
                windowMap.remove(prev);
            }
            String next= discount[i];
            windowMap.put(next, windowMap.getOrDefault(next,0)+1);
            if(isValid(map,windowMap)){
                answer++;
            }
        }
        return answer;
    }
    public boolean isValid(Map<String,Integer> map, Map<String,Integer> windowMap){
        for(String key : map.keySet()){
            if(windowMap.getOrDefault(key,0)<map.get(key)){
                return false;
            }
        }
        return true;
    }
}