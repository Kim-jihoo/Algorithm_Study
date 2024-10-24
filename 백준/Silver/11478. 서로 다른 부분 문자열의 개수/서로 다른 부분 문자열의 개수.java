import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        HashSet<String> str = new HashSet<>();
        for(int i=0; i<S.length();i++){
            for(int j=i+1; j<=S.length();j++){
                str.add(S.substring(i,j));
            }
        }
        System.out.println(str.size());
    }
}

