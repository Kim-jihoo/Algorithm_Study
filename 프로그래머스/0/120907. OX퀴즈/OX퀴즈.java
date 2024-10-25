class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String []ch = quiz[i].split(" ");
            int x = Integer.parseInt(ch[0]);
            String operator = ch[1];
            int y = Integer.parseInt(ch[2]);
            int z = Integer.parseInt(ch[4]);
            
            int n=0;
            if(operator.equals("+")){
                n=x+y;
            }else if(operator.equals("-")){
                n=x-y;
            }
            if(z==n) answer[i]="O";
            else answer[i]="X";
        }
        return answer;
    }
}