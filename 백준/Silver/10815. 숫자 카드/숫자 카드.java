import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] result = new int[M];
        for(int i=0; i<M; i++){
            int b = Integer.parseInt(st.nextToken());
            if(set.contains(b)){
                result[i]=1;
            }else result[i]=0;
        }

        bw.write(Integer.toString(result[0]));
        for(int i=1; i<M;i++){
            
            bw.write(" "+ result[i]);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}