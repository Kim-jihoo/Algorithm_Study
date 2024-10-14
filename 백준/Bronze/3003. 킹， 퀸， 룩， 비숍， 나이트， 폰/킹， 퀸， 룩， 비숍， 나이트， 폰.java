import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int [] correct={1,1,2,2,2,8};
        int[] input = new int[6];
        for(int i=0; i<6; i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<6; i++){
            System.out.print((correct[i]-input[i])+ " ");
        }
        
    }
}