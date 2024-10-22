import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            set.add(nums[i]);
        }
        int a = nums.length/2;
        int answer = 0;
        if(set.size()>a){
            answer=a;
        }else answer=set.size();
        return answer;
    }
}