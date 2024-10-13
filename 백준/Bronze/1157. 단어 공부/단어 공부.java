import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        solution(str);
    }
    public static void solution(String str){
        int[] counts = new int[26];
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            counts[ch-'A']++;    
        }
        int n = -1;
        char result ='?';
        for(int i=0; i<counts.length;i++){
            if(counts[i]>n){
                n=counts[i];
                result=(char)(i+'A');
            }else if(counts[i]==n){
                result='?';
            }
        }
        System.out.println(result);
    }
}