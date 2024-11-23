class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = String.valueOf(num);
        String str[] = s.split("");
        String a = String.valueOf(k);
        for(int i=0; i<str.length; i++){
            if(str[i].equals(a)){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}