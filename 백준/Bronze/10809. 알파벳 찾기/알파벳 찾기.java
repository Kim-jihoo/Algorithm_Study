import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        solution(str);
    }
    public static void solution(String str){
        int [] result = new int[26];
        for(int i=0; i<26; i++){
            result[i]=-1;
            }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int index = ch-'a';
            if(result[index]==-1){
                result[index]=i;
            }
        }
            for(int i=0; i<26; i++){
                System.out.print(result[i]+ " ");
        }
    }
}