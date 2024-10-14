import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sc = new int[N];
        for(int i=0; i<N; i++){
            sc[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sc);
        int max = sc[N-1];
        double sum=0;
        for(int i=0; i<N; i++){
            sum += (double)sc[i]/max*100;
        }
       double average = sum/N;
        System.out.println(average);
    }
}