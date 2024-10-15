import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int min=0;
        for(int i=0; i<a; i++){
            int sum=i;
            int temp =i;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum==a){
                min=i;
                break;
            }
        }
        System.out.println(min);
    }
}