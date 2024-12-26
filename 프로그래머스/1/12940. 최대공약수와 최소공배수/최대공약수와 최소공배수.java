class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]=gcd(n,m);
        answer[1]=lcd(answer[0],n,m);
        return answer;
    }
    public int gcd(int n, int m){
        while(m!=0){
            int temp = m;
            m =n%m;
            n=temp;
        }
        return n;
    }
    public int lcd(int a, int n, int m){
        return a*(n/a)*(m/a);
    }
}