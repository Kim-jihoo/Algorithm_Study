import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0; i<a;i++){
            int b = Integer.parseInt(br.readLine());
            int quarter = b/25;
            b %=25;
            int dime = b/10;
            b %=10;
            int nickel = b/5;
            b%=5;
            int penny=b;
            System.out.println(quarter+" "+dime+" "+ nickel+ " "+ penny);
        }
    }
}