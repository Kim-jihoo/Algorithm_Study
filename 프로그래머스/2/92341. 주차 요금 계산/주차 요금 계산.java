import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<String, String> in = new HashMap<>();

        for(int i=0; i<records.length; i++){
            String s = records[i].substring(6,10);
            String time = records[i].substring(0,5);
            if(records[i].contains("IN")){
                in.put(s,time); 
            }else{
                String str = in.get(s);
                int rec = cal(str, time);
                int car = Integer.parseInt(s);
                map.put(car,map.getOrDefault(car,0)+rec);
                in.remove(s);
                
            }
        }
        for(String s : in.keySet()){
          String str = in.get(s);
            int rec = cal(str, "23:59"); 
            int car = Integer.parseInt(s);
            map.put(car, map.getOrDefault(car, 0) + rec);
        }
        int [][] cars = new int[map.size()][2];
        int idx =0;
        for(int i : map.keySet()){
            cars[idx][0] = i;
            cars[idx][1] = map.get(i);
            idx++;
        }
        Arrays.sort(cars,(a,b)->Integer.compare(a[0],b[0]));
        int[] answer = new int[cars.length];
        for(int i=0; i<answer.length; i++){
            answer[i]=money(cars[i][1],fees);
        }
        return answer;
    }
    public int cal(String str, String time){
         int start = Integer.parseInt(str.substring(0,2)) * 60 + Integer.parseInt(str.substring(3,5));
        int end = Integer.parseInt(time.substring(0,2)) * 60 + Integer.parseInt(time.substring(3,5));
        return end - start;
        
    }
    public int money(int totaltime, int[] fees){
        int baseTime = fees[0];
        int baseFee = fees[1];
        int time = fees[2];
        int fee = fees[3];
        if(totaltime<=baseTime){
            return baseFee;
        }
        if((totaltime-baseTime)%time!=0){
            return baseFee+((totaltime-baseTime)/time+1)*fee;
        }
        return baseFee+(totaltime-baseTime)/time*fee;
    }
}