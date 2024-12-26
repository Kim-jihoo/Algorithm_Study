class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x = Math.max(sizes[0][0], sizes[0][1]);
        int y = Math.min(sizes[0][0], sizes[0][1]);
        
        for(int i=0; i<sizes.length; i++){
            int a = Math.max(sizes[i][0],sizes[i][1]);
            int b = Math.min(sizes[i][0],sizes[i][1]);
            x = Math.max(a,x);
            y = Math.max(b,y);
        }
        answer=x*y;
        return answer;
    }
}