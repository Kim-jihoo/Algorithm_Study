import java.util.*;
import java.io.*;

public class Main{
    static int N,M;
    static int[][] answer;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy ={0,0,-1,1};
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = new int[N][M];
       
        for(int i=0; i<N; i++){
            String[] str = br.readLine().split("");
            for(int j=0; j<M; j++){
                answer[i][j]=Integer.parseInt(str[j]);
               
            }
        }
        visited = new boolean[N][M];
        bfs(0,0);
        System.out.println(answer[N-1][M-1]);
    }
    public static void bfs(int a, int b){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a,b});
        
        while(!queue.isEmpty()){
            int node[] = queue.poll();
            int nodeX = node[0];
            int nodeY = node[1];
            for(int i=0; i<4; i++){
                int x = nodeX + dx[i];
                int y = nodeY + dy[i];
                if(x<0||y<0||x>=N||y>=M){
                    continue;
                }
                if(visited[x][y] || answer[x][y]==0) continue;
                queue.add(new int[]{x,y});
                answer[x][y]=answer[nodeX][nodeY]+1;
                visited[x][y]=true;
            }
            
        }
        
    }
}