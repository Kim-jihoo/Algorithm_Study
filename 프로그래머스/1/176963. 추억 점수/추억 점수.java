import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            int n = photo[i].length;
            int num =0;
            for(int j=0; j<n; j++){
                if(map.containsKey(photo[i][j])){
                    num+=map.get(photo[i][j]);
                }
            }
            answer[i]=num;
        }
        return answer;
    }
}