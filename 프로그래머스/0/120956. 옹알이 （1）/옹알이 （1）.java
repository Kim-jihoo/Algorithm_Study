class Solution {
    public int solution(String[] babbling) {
        
        int answer = 0;

        for(int i=0; i<babbling.length; i++){
            int n=0;
            babbling[i]=babbling[i].replace("aya","*");
            babbling[i]=babbling[i].replace("ye","*");
            babbling[i]=babbling[i].replace("woo","*");
            babbling[i]=babbling[i].replace("ma","*");
            String str = babbling[i];
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(ch!='*'){
                    n++;
                }
            }
            if(n==0) answer++;
        }
        
        return answer;
    }
}