import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        for(int key : map.keySet()){
            list.add(map.get(key));
        }
        Collections.sort(list,(a,b)->b-a);
        answer = list.get(0);
        if(list.size()>1&&list.get(0)==list.get(1)){
            answer=-1;
        }else{
            for(int key : map.keySet()){
                if(map.get(key)==answer){
                    answer=key;
                    break;
                }
            }
        }
        return answer;
    }
}