import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        solution(n, br);
    }
    public static void solution(int n, BufferedReader br) throws IOException{
        for(int i=0; i<n; i++){
            String []str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            String s = str[1];
            for(int j=0; j<s.length(); j++){
                for(int k=0; k<a; k++){
                    System.out.print(s.charAt(j));
                }
              
            }
            System.out.println();
        }
    }
}