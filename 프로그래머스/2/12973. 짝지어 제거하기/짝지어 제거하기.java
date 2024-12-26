import java.util.*;
import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
             if(!stack.isEmpty()&&stack.peek().equals(str[i])){
                stack.pop();
            }else{
                 stack.push(str[i]);
             }
        }
        if(stack.isEmpty()){
            answer=1;
        }
        

        return answer;
    }
}