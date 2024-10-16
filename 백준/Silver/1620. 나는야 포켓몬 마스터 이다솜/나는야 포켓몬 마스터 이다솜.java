import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> nameToNum = new HashMap<>();
        HashMap<Integer, String> numToName = new HashMap<>();
        
        for(int i=1; i<=N; i++){
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName.put(i, name);
        }
        
        for(int i=0; i<M; i++){
            String a = br.readLine();
            if(Character.isDigit(a.charAt(0))){
                int num = Integer.parseInt(a);
                bw.write(numToName.get(num)+ "\n");
            }else{
                bw.write(nameToNum.get(a)+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}