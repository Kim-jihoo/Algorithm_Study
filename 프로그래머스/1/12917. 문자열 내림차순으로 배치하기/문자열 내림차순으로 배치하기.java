import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder(new String(ch));
        answer=sb.reverse().toString();
        return answer;
    }
}