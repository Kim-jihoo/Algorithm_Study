class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int n=0;
        int a =x;
        while(a>10){
            n+=a%10;
            a=a/10;
        }
        if(x%(n+a)==0){
            answer=true;
        }
        return answer;
    }
}