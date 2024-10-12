import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = solution(input);
        System.out.println(result);
    }
    public static int solution(String input){
        StringTokenizer st = new StringTokenizer(input, " ");
        return st.countTokens();
    }
}