class Solution {
    public int solution(int[] common) {
        int answer = 0;
        /*
        if((common[2]/common[1])==(common[1]/common[0])){
            answer = (common[2]/common[1])*common[common.length-1];
        }else{
        
            answer=common[1]-common[0]+common[common.length-1];
        }*/
        if(common[2]-common[1]==common[1]-common[0]){
            answer=common[1]-common[0]+common[common.length-1];
        }else{
             answer = (common[2]/common[1])*common[common.length-1];
        }
        return answer;
    }
}