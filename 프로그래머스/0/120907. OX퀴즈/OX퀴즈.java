class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
        for(int i=0; i<answer.length; i++){
            int k = 0;
            String str[] = quiz[i].split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[2]);
            int c = Integer.parseInt(str[4]);
            if(str[1].equals("+")){
                k=a+b;
            }else{
                k=a-b;
            }
            if(k==c){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
        }
        return answer;
    }
}