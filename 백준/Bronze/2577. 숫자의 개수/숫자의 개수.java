import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        solution(a, b, c);
    }
    public static void solution(int a, int b, int c){
        String d = Integer.toString(a*b*c);
        int [] n = new int [10];
        for(int i=0; i<d.length();i++){
            int e = d.charAt(i)-'0';
            n[e]++;
        }
        for(int i=0; i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}