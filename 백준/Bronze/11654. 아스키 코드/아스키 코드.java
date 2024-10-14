import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = (char)br.read();
        int result = solution(ch);
        System.out.println(result);
    }
    public static int solution(char ch){
        return (int)ch;
    }
}