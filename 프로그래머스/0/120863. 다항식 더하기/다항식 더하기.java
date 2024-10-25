class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a=0; int b=0;
        
       
            String [] str = polynomial.split(" ");
            for(int j=0; j<str.length; j++){
                if(str[j].endsWith("x")){
                    if(str[j].equals("x")){
                        a+=1;
                    }else{
                        a += Integer.parseInt(str[j].substring(0,str[j].length()-1));
                    }
                 
                }else if(str[j].equals("+")){
                    continue;
                }else{
                     b += Integer.parseInt(str[j]);
                }
            }
        
        if(a>1&&b>0){
            answer = a+"x"+" + "+b;
        }else if(a>1){
            answer = a+"x";
        }else if(a==1&&b>0){
            answer="x"+" + "+b;
        }else if(a==1&&b==0){
            answer="x";
        } else{
            answer = String.valueOf(b);
        }
        
        return answer;
    }
}