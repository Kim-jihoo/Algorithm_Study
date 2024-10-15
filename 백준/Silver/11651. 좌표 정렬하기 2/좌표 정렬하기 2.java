import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int [][] a = new int [N][2];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
        }
            Arrays.sort(a,(p1, p2) -> {
                if(p1[1]==p2[1]){
                    return p1[0]-p2[0];
                }else{
                    return p1[1]-p2[1];
                }
            });
                for(int i=0; i<N;i++){
                    bw.write(a[i][0]+ " " + a[i][1] + "\n");
                }
        bw.flush();
        bw.close();
        br.close();
    }
}