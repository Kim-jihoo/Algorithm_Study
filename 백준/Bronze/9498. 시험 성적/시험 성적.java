import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        if(a>=90){
            System.out.println("A");
        }else if(a>=80&a<90){
            System.out.println("B");
        }else if(a>=70&a<80){
            System.out.println("C");
        }else if(a>=60&a<70){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        
    }
}