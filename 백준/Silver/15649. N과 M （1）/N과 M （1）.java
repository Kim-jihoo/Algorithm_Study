import java.util.*;
import java.io.*;
public class Main{
    public static boolean [] visited;
    public static int [] arr;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
		visited = new boolean[n];
        dfs(n,m,0);
    }
    public static void dfs(int n, int m, int depth){
        if(depth==m){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth]=i+1;
                dfs(n,m,depth+1);
                visited[i] =false;
            }
        }
    }
}