import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String a = br.readLine();
        for(int i=0; i<str.length; i++){
            String ch = str[i];
            a = a.replace(ch,"*");
        }
        System.out.println(a.length());
    }
}