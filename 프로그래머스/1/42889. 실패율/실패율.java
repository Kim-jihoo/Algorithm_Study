import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] player = new int[N+2];
        int total = stages.length;
        
        for(int i=0; i<stages.length; i++){
            player[stages[i]]++;
        }
        double[][] fail = new double[N][2];
        for(int i=1; i<=N; i++){
            if(total==0){
                fail[i-1][0]=0.0;
            }else{
                fail[i-1][0] = (double)player[i]/total;
            }
            fail[i-1][1]=i;
            total-=player[i];
        }
        Arrays.sort(fail,(a,b)->{
            if(a[0]==b[0]){
                return Double.compare(a[1], b[1]); // 번호 오름차순
            }
            return Double.compare(b[0], a[0]);
        });
        for(int i=0; i<N; i++){
            answer[i]=(int)fail[i][1];
        }
        
        return answer;
    }
}