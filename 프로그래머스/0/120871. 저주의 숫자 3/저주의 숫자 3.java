class Solution {
    public int solution(int n) {
        int count=0;
        int current=0;
        while(count<n){
            current++;
            if(isValidNumber(current)){
                count++;
            }
        }
        int answer = current;
        return answer;
    }
    private boolean isValidNumber(int num){
        return num%3!=0&&!String.valueOf(num).contains("3");
    }
}