import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize==0) return cities.length*5;
        LinkedHashMap<String, Boolean> cache = new LinkedHashMap<>(cacheSize, 0.75f, true);
        
        for(String city : cities){
            city = city.toLowerCase();
            if(cache.containsKey(city)){
                answer+=1;
            }else{
                answer+=5;
                if(cache.size()>=cacheSize){
                    String oldestKey = cache.keySet().iterator().next();
                    cache.remove(oldestKey);
                }
            }
            cache.put(city, true);
        }
        return answer;
    }
}