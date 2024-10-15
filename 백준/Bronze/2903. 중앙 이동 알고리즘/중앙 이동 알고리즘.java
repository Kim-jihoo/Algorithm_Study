import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int result = (int)Math.pow((int)Math.pow(2,a)+1,2);
        System.out.println(result);
    }
}