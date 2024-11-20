class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = max(n,m);
        answer[1]=min(n,m);
        return answer;
    }
    public int max(int n, int m){
        int a =1;
        int b =1;
        if(n>m) b=m;
        else b=n;
        for(int i=2; i<=b; i++){
            if(n%i==0&&m%i==0){
                a=i;
            }
        }
        return a;
    }
    public int min(int n, int m){
        int a = n*m;
        if(n>m){
            int k = n;
            n=m;
            m=k;
        }
        for(int i=m; i>=1; i--){
            if(n*i%m==0){
                a=i*n;
            }
        }
        return a;
    }
}