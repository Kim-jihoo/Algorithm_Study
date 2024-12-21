import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int a = commands[i][1];
            int b = commands[i][0];
            int[] arr = new int[a-b+1];
            int idx = 0;
            for(int j=b-1; j<a; j++){
                arr[idx] = array[j];
                idx++;
            }
            Arrays.sort(arr);
            answer[i]=arr[commands[i][2]-1];
        }
        return answer;
    }
}