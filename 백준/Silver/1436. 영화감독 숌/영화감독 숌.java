import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count=0;
        int num = 666;
        while(true){
            if(String.valueOf(num).contains("666")){
                count++;
            }
            if(count==a){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}