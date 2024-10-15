import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        long decimal =0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            int value;
            if(ch >='0' && ch<='9'){
                value = ch-'0';
            }else{
                value = ch - 'A'+10;
            }
            decimal = decimal*n+value;
            
        }
        System.out.println(decimal);
    }
}