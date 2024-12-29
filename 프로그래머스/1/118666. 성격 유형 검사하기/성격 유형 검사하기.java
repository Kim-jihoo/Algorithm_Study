class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int T = 0;
        int R = 0;
        int C = 0;
        int F = 0;
        int M = 0;
        int J = 0;
        int A = 0;
        int N = 0;
        for(int i=0; i<survey.length; i++){
            String s1 = survey[i].substring(0,1);
            String s2 = survey[i].substring(1,2);
            if(choices[i]<4){
                if(s1.equals("T")){
                    T+=4-choices[i];
                }else if(s1.equals("R")){
                    R+=4-choices[i];
                }else if(s1.equals("C")){
                    C+=4-choices[i];
                }else if(s1.equals("F")){
                    F+=4-choices[i];
                }else if(s1.equals("M")){
                    M+=4-choices[i];
                }else if(s1.equals("J")){
                    J+=4-choices[i];
                }else if(s1.equals("A")){
                    A+=4-choices[i];
                }else if(s1.equals("N")){
                    N+=4-choices[i];
                }
            }else if(choices[i]>4){
                if(s2.equals("T")){
                    T+=choices[i]-4;
                }else if(s2.equals("R")){
                    R+=choices[i]-4;
                }else if(s2.equals("C")){
                    C+=choices[i]-4;
                }else if(s2.equals("F")){
                    F+=choices[i]-4;
                }else if(s2.equals("M")){
                    M+=choices[i]-4;
                }else if(s2.equals("J")){
                    J+=choices[i]-4;
                }else if(s2.equals("A")){
                    A+=choices[i]-4;
                }else if(s2.equals("N")){
                    N+=choices[i]-4;
                }
            }
        }
        if(T>R){
                answer+="T";
            }else{
                answer+="R";
            }
            if(F>C){
                answer+="F";
            }else{
                answer+="C";
            }
            if(M>J){
                answer+="M";
            }else{
                answer+="J";
            }
            if(N>A){
                answer+="N";
            }else{
                answer+="A";
            }
        return answer;
    }
}