import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String str [] = A.split("");
        String a = str[str.length-1];
        StringBuilder sb = new StringBuilder(a);
        for(int i=0; i<A.length(); i++){
            if(A.equals(B)){
                break;
            }
            A = A.substring(A.length()-1)+A.substring(0,A.length()-1);           
            answer++;
        }
        if(!A.equals(B)) answer=-1;
        return answer;
    }

}