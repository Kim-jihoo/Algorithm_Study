import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        solution(a, br);
    }
    public static void solution(int a, BufferedReader br) throws IOException{
        for(int i=0; i<a; i++){
            String test = br.readLine();
            int n=0; int sum=0;
            for(int j=0; j<test.length(); j++){
                char ch = test.charAt(j);
                if(ch=='O'){
                    n++;
                    sum+=n;
                }else{
                    n=0;
                }
                
            }
            System.out.println(sum);
        }
    }
}