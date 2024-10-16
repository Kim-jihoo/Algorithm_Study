import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        HashMap<Integer, Integer> count = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
           int card = Integer.parseInt(st.nextToken());
            count.put(card, count.getOrDefault(card, 0)+1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        
        for(int i=0; i<M; i++){
            int q = Integer.parseInt(st.nextToken());
            bw.write(count.getOrDefault(q,0)+" ");
            }
        bw.flush();
        bw.close();   
    }
}