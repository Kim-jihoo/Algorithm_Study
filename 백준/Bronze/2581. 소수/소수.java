import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int n=0; int k=0; 
        for(int i=b; i>=a; i--){
            int temp=0;
            if(i==1){
                temp++;
            }
            for(int j=2; j<i; j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(temp==0){
                    k=i;
                    n+=i;
                }
        }
        if(n==0){
             System.out.println(-1);
          }else{
              System.out.println(n);
              System.out.println(k);
         }
    }
}