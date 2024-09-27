import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int height = board.length;
        int moves_cnt = moves.length;
        Stack<Integer> basket = new Stack<>();
        
        for(int i=0; i<moves_cnt; i++){
            int pos = moves[i]-1;
             for(int j=0; j<height; j++){
                if(board[j][pos]==0){
                    continue;
                }
                int doll = board[j][pos];
                board[j][pos] = 0;
                
                if(!basket.empty() && doll == basket.peek()){
                    basket.pop();
                    answer+=2;
                }
                 else{
                     basket.push(doll);
                 }break;
            }
        }
        
        
        return answer;
    }
}