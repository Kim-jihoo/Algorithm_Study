import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
       
        for(int i=1; i<=a; i++){
          for(int j=0; j<a-i;j++){
              System.out.print(" ");
          }
           for(int k=0; k<2*i-1;k++){
               System.out.print("*");
           }
            System.out.println();
        }
        for (int i=a-1; i >= 1; i--) {

            for (int j=0; j<a-i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
