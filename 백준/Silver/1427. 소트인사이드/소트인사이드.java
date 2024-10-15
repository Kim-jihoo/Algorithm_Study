import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String N = br.readLine();
        char[] ch = N.toCharArray();
        Arrays.sort(ch);
        for(int i=ch.length-1; i>=0; i--){
            bw.write(ch[i]);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}