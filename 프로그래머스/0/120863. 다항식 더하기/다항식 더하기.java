class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" ");
        int a =0;
        int b =0;
        for(int i=0; i<str.length; i++){
            if(str[i].contains("x")){
                if(str[i].equals("x")){
                    a++;
                }else{
                    a+=Integer.parseInt(str[i].substring(0,str[i].length()-1));
                }
            }else if(!str[i].equals("+")){
                b+=Integer.parseInt(str[i]);
            }
        }
        if (a > 0 && b > 0) { // x항과 상수항 모두 존재
            if (a == 1) { 
                answer = "x + " + b;
            } else {
                answer = a + "x + " + b;
            }
        } else if (a > 0) { // x항만 존재
            if (a == 1) {
                answer = "x";
            } else {
                answer = a + "x";
            }
        } else if (b > 0) { // 상수항만 존재
            answer = String.valueOf(b);
        }
        
        return answer;
    }
}