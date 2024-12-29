import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[][] fail = new double[N][2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<stages.length; i++){
            map.put(stages[i],map.getOrDefault(stages[i],0)+1);
        }
        int num =stages.length;
        for(int i=0; i<N; i++){
            if(map.containsKey(i+1)){
                fail[i][0]=i+1;
                fail[i][1]=(double)map.get(i+1)/num;
                num-=map.get(i+1);
            }else{
                fail[i][0]=i+1;
                fail[i][1]=0;
            }
        }
        int[] answer = new int[N];
        Arrays.sort(fail,(a,b)->Double.compare(b[1],a[1]));
        for(int i=0; i<N; i++){
            answer[i]=(int)fail[i][0];
        }
        return answer;
    }
}