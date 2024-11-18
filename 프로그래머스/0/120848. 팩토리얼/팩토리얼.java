class Solution {
    public int solution(int n) {
        int answer = 1;
        int num=1;
        while(answer<=n){
            answer*=num;
            num++;
        }
        return (num-2);
    }
}