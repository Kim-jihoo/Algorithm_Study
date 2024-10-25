class Solution {
    public int solution(int balls, int share) {
        
        return (int)comb(balls,share);
    }
    private long comb(int n, int r){
        long result=1;
        for(int i=0; i<r; i++){
            result*=(n-i);
            result/=(i+1);
        }
        return result;
    }
}