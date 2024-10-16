import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }
        ArrayList<String> a = new ArrayList<>();
        
        for(int i=0; i<M; i++){
            String str = br.readLine();
            if(set.contains(str)){
                a.add(str);
            }
        }
        Collections.sort(a);
        bw.write(a.size()+"\n");
        for(String str : a){
            bw.write(str+"\n");
        }
        bw.flush();
        bw.close();
    }
}