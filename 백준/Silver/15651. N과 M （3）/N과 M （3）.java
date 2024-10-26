import java.util.*;
import java.io.*;
public class Main{
    public static int arr[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int [m];
        dfs(n,m,0);
        System.out.println(sb);
    }
    public static void dfs(int n, int m,int depth){
        if(depth==m){
            for(int i=0; i<arr.length; i++){
               sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=0; i<n; i++){
            arr[depth]=i+1;
            dfs(n,m,depth+1);
        }
    }
}