import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr =new int[N];
        for(int i=0; i<N; i++){
            arr[i]=i+1;
        } // [1,2,3,4,5]
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken()); //1 4
            
            int start = a-1;
            int end = b-1;
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        for(int i=0; i<arr.length;i++){
            if(i>0){
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}