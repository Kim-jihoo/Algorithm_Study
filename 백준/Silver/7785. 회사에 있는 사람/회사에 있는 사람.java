import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        HashSet<String> em = new HashSet<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();
            
            if(action.equals("enter")){
                em.add(name);
            }else if(action.equals("leave")){
                em.remove(name);
            }
            
        }
        ArrayList<String> result = new ArrayList<>(em);
        Collections.sort(result, Collections.reverseOrder());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(String name : result){
                bw.write(name+"\n");
            }
        bw.flush();
        bw.close();
        
    }
}