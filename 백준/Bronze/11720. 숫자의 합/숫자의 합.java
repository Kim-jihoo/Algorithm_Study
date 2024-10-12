import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String number = br.readLine();
        int result = solution(a, number);
        System.out.println(result);
    }
    public static int solution(int a, String number){
        int sum=0;
        for(int i=0; i<a; i++){
            sum+=number.charAt(i)-'0';
        }
        //return sum;
        return sum;
    }
}