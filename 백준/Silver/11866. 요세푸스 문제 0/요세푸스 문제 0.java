import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        int k = Integer.parseInt(st.nextToken());
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<k-1; j++){
                
                queue.offer(queue.poll());
            }
            
            arr[i] = queue.poll();
        }
         System.out.print("<");
     for(int i=0; i<n; i++){
         if (i == n- 1) {
                System.out.print(arr[i]);  // 마지막 원소는 ", "를 붙이지 않음
            }else System.out.print(arr[i]+", ");
     }   
         System.out.print(">");
    }
}