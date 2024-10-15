import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(a>0){
            long rem = a%b;
            char digit;
            if(rem<10){
                digit = (char)(rem+'0');
            }else{
                digit =(char)(rem-10+'A');
            }
               sb.append(digit);
               a/=b;
        }
               System.out.println(sb.reverse().toString());
    }
}