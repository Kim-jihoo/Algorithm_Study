
class Solution {
    public int solution(int[] sides) {

        int answer = 0;
        int sum = sides[0]+sides[1];
        int diff = Math.abs(sides[0]-sides[1]);
        answer= sum-diff-1;
        return answer;
    }
}