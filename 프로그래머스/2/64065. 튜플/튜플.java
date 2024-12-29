import java.util.*;
class Solution {
    public int[] solution(String s) { //for each에서 string int 잘 사용
        s = s.substring(2,s.length()-2);
        s = s.replace("},{"," ");
        String[] str = s.split(" ");
        Arrays.sort(str,(a,b)-> a.length()-b.length());
        ArrayList<Integer> list = new ArrayList<>();
        for(String n : str){
            if(n.length()>1){
                String[] a = n.split(",");
                for(int j=0; j<a.length; j++){
                    int num = Integer.parseInt(a[j]);
                    if(!list.contains(num)){
                        list.add(num);
                    }
                }
            }else{
                list.add(Integer.parseInt(n));
            }
        }
        int[] answer = new int[list.size()];
        int idx=0;
        for(int i : list){
            answer[idx++] = i;
        }
        return answer;
    }
}