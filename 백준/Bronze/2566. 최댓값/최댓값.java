import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int k =0; 
        int h = 0;
        int a =0;
        int [][] arr = new int[9][9];
        
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int j=0; j<9; j++){
                int b = Integer.parseInt(st.nextToken());
                if(Math.max(a,b)==b){
                    n=b; k=i+1; h=j+1;
                    a=b;
                }
                
            }
        }
        
        System.out.println(n);
        System.out.println( k+ " "+h );
    }
}