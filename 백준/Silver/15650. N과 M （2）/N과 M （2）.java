import java.util.*;
import java.io.*;
public class Main{
    public static boolean visit[];
    public static int arr [];
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visit = new boolean[n+1];
        arr = new int[m];
        dfs(n,m,1, 0);
    }
    public static void dfs(int n, int m, int a, int depth){
        if(depth==m){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=a; i<=n; i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i;
                dfs(n,m,i+1,depth+1);
                visit[i]=false;
      
            }
            
        }
    }
}