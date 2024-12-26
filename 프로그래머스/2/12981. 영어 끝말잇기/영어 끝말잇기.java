import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> set = new HashSet<>();
        int num =1;
        set.add(words[0]);
        for(int i=1; i<words.length; i++){
            String s1 = words[i-1].substring(words[i-1].length()-1,words[i-1].length());
            String s2 = words[i].substring(0,1);
            if(s1.equals(s2)&&!set.contains(words[i])){
                set.add(words[i]);
                num++;
            }else{
                num++;
                break;
            }
        }
        if(set.size()!=num){
            answer[0]=num%n;
            if(answer[0]==0){
                answer[0]=n;
                answer[1]=num/n;
            }else{
                answer[0]=num%n;
                answer[1]=num/n+1;
            }
        }
        
        
        
        return answer;
    }
}