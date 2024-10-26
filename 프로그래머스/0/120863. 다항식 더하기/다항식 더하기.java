import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int n = 0;
        int m = 0;
        String [] str = polynomial.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].contains("x")&&str[i].length()>1){
                n= n+Integer.parseInt(str[i].substring(0,str[i].length()-1));
            }else if(str[i].equals("x")){
                n++;
            }else if(str[i].equals("+")){
                continue;
            }else{
                m=m+Integer.parseInt(str[i]);
            }
        }
        if(n>1){
            if(m>=1){
                answer = String.valueOf(n)+"x"+ " + "+String.valueOf(m);
            }else{
                answer = String.valueOf(n)+"x";
            } 
        }else if(n==0){
            answer = String.valueOf(m);
        }else if(n==1){
            if(m>=1){
                answer = "x"+ " + "+String.valueOf(m);
            }else{
                answer = "x";
            }
        }
        return answer;
    }
}