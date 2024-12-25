import java.util.*;
class Solution {
        HashSet<Integer> set = new HashSet<>();
    public int solution(int[] elements) {
        int answer = 0;
        int  n =elements.length;
        int[] ex = new int[2*n];
        for(int i=0; i<n; i++){
            ex[i]=elements[i];
            ex[i+n] = elements[i];
        }
        
        for(int i=1; i<=n; i++){
            for(int start=0; start<n; start++){
                int sum=0;
                for(int j=0; j<i; j++){
                    sum+=ex[start+j];
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }

}