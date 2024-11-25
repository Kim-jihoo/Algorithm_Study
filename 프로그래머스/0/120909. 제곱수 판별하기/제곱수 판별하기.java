import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 2;
        int a = (int)Math.sqrt(n);
        if(a*a==n){
            answer=1;
        }
        return answer;
    }
}