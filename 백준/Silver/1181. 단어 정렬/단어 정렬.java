import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for(int i=0; i<N;i++){
            set.add(br.readLine());
        }
        List<String> list = new ArrayList<>(set);
        list.sort((s1,s2)->{
            if(s1.length()==s2.length()){
                return s1.compareTo(s2);
            }else{
                return s1.length()-s2.length();
            }
        });
        for (String word : list) {
            bw.write(word + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}