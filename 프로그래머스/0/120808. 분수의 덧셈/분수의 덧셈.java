class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = numer1*denom2+numer2*denom1;
        int denom=denom1*denom2;
        for(int i=2; i<=numer; i++){
            while(denom%i==0&&numer%i==0){
                numer=numer/i;
                denom=denom/i;
            }
         /*   if(denom%i==0&&numer%i==0){
                numer=numer/i;
                denom=denom/i;
            }*/
        }
        answer[0]=numer;
        answer[1]=denom;
        return answer;
    }
}