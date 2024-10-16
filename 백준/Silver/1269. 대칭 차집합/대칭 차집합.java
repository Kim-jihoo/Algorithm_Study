import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a =Integer.parseInt(st.nextToken());
        int b =Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        HashSet<Integer> aset = new HashSet<>();
        for(int i=0; i<a; i++){
            aset.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        HashSet<Integer> bset = new HashSet<>();
        for(int i=0; i<b; i++){
            bset.add(Integer.parseInt(st.nextToken()));
        }
        
        int an=0; int bn=0;
        for(int num : aset){
            if(!bset.contains(num)){
                an++;
            }
        }
  
        for(int num : bset){
            if(!aset.contains(num)){
                bn++;
            }
        }
  
        bw.write(Integer.toString(an+bn));
        bw.flush();
        bw.close();
    }
}