class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long b = Long.parseLong(p);
        for(int i=0; i<=t.length()-p.length(); i++){
            long a = Long.parseLong(t.substring(i,i+p.length()));
            if(a<=b){
                answer++;
            }
        }
        return answer;
    }
}