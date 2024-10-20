import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> pok = new HashSet<>();
        int a = nums.length/2;
        for(int i=0; i<nums.length;i++){
            pok.add(nums[i]); 
        }
        if(pok.size()>a){
            answer=a;
        }else{
            answer=pok.size();
        }
        return answer;
    }
}