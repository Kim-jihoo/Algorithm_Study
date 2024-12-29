import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            if(str.length==3){
                map.put(str[1],str[2]);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            String id = map.get(str[1]);
            if(str[0].equals("Enter")){
                list.add(id+"님이 들어왔습니다.");
            }else if(str[0].equals("Leave")){
                list.add(id+"님이 나갔습니다.");
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}