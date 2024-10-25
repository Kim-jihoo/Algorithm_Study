import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int [][] arr = new int[numlist.length][2]; 
        Arrays.sort(numlist);
        for(int i=0; i<numlist.length; i++){
            arr[i][0] = numlist[i];
            arr[i][1] = Math.abs(numlist[i]-n);
        }
        Arrays.sort(arr,(a,b)->{
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }else{
                return b[0]-a[0];
            }
        });
        for(int i=0; i<answer.length; i++){
            answer[i]=arr[i][0];
        }
        return answer;
    }
}