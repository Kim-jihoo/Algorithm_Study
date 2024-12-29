import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int n=26;
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        char ch = 'A';
        for(int i=1; i<=26; i++){
            String str = String.valueOf(ch);
            map.put(str,ch-'A'+1);
            ch = (char) (ch + 1);
        }
        
        String[] str = msg.split("");
        for(int i=0; i<str.length; i++){
            sb.append(str[i]);
            String s = sb.toString();
            if(map.containsKey(s)){
                continue;
            }else{
                n+=1;
                map.put(s,n);
                s= s.substring(0,s.length()-1);
                list.add(map.get(s));
                sb.replace(0,sb.length(),str[i]);
            }
        }
        if (sb.length() > 0) {
             list.add(map.get(sb.toString()));
        }
        int[] answer = new int[list.size()];
        int idx=0;
        for(int i : list){
            answer[idx++]=i;
        }
        return answer;
    }
}