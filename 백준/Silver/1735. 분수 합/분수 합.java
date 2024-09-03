import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e=a*d+c*b;
        int f =b*d;
        int gcd = 1;
        while(true){
            int tmp = f%e;
            if(tmp==0){
                gcd = e;
                break;
            }else{
                f=e;
                e=tmp;
            }
        }
        e=(a*d+b*c)/gcd;
        f=b*d/gcd;
        System.out.println(e+" "+f);
        scanner.close();
      
    }

}