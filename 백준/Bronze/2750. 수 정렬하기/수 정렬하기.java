import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int [] result = new int[a];
        for(int i=0; i<result.length; i++){
            result[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(result);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
        
    }

}