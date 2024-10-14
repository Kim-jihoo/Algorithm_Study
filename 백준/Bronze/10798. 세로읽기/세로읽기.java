import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] words = new String[5];
       for(int i=0; i<5; i++){
           words[i] = br.readLine();
       }
        StringBuilder result = new StringBuilder();
        for(int j=0; j<15;j++){
            for(int i=0; i<5; i++){
                if(j<words[i].length()){
                    result.append(words[i].charAt(j));
                }
            }
        }
        System.out.println(result.toString());
    }
}