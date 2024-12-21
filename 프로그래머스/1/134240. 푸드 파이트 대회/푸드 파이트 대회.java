class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer.append(String.valueOf(i));
            }
        }
        StringBuilder str = new StringBuilder(answer.toString());
        answer.reverse();
        answer.insert(0,str);
        answer.insert(answer.length()/2,"0");
      
        return answer.toString();
    }
}