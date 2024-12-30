class Solution {
    public int solution(String s) {
        int answer = 0;
        int ml = s.length();
        for(int i=1; i<=s.length()/2; i++){
            String compressed ="";
            String prev = s.substring(0,i);
            int count=1;
            for(int j=i; j<s.length(); j+=i){
                String current = s.substring(j, Math.min(j+i,s.length()));
                if(current.equals(prev)){
                    count++;
                }else{
                    compressed+=(count>1?count:"")+prev;
                    prev=current;
                    count=1;
                }
            }
            compressed+=(count>1?count:"")+prev;
            ml=Math.min(ml,compressed.length());
        }
        return ml;
    }
}