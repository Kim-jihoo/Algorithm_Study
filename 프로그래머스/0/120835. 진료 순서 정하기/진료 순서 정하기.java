import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] answer=new int[emergency.length];
        int [] a = new int[emergency.length];
        for(int i=0; i<a.length; i++){
            a[i]=emergency[i];
        }
        for(int i=0;i <emergency.length;i++){
            map.put(emergency[i],i);
        }
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            answer[map.get(a[a.length-i-1])] = i+1;
        }
        return answer;
    }
}