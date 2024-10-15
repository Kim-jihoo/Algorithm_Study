import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] k = new int[N];
        for(int i=0; i<N; i++){
            k[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(k);
        for(int i=0; i<k.length;i++){
            System.out.println(k[i]);
        }
    }
}