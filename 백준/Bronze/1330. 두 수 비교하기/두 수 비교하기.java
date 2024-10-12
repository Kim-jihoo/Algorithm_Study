import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String []str = bf.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        String result = solution(a, b);
        System.out.println(result);
    }
    
        public static String solution(int a, int b){
            if(a>b){
            return ">";
        }else if(a<b){
            return "<";
        }else{
            return "==";
        }
        
    }
}