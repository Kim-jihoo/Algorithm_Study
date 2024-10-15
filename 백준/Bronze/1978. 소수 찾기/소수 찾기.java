import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());   
        
        int sum=0;
        for(int i=0; i<a; i++){
            int num = Integer.parseInt(st.nextToken());
            int n=0;
            if(isPrime(num)){
                sum++;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }return true;
    }
}