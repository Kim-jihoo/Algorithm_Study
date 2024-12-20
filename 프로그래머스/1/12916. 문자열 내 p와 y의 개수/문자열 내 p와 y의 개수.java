class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a =0; int b =0;
        for(int i=0; i<s.length(); i++){
            char str = s.charAt(i);
            if(str=='P'||str=='p'){
                a++;
            }
            if(str=='Y'||str=='y'){
                b++;
            }
        }
        if(a!=b){
            answer=false;
        }
        
        return answer;
    }
}