import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int [] a = new int[N];
        for(int i=0; i<N; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        for(int i=0; i<N; i++){
            bw.write(a[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}