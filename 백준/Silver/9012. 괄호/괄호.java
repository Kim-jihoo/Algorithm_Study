import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
 
        
        int n=Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            Stack<String> stack = new Stack<>();
            int answer = 0;
            String []str = br.readLine().split("");
            if (str.length == 0 || str[0].equals(")")) {
                System.out.println("NO");
                continue;
            }
            for(int j=0; j<str.length; j++){
                
                if(str[j].equals("(")){
                    answer++;
                    stack.push(str[j]);
                }else{
                    answer--;
                    if(answer<0){
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(answer!=0) {System.out.println("NO");}
                else {System.out.println("YES"); }
        }
    }
}