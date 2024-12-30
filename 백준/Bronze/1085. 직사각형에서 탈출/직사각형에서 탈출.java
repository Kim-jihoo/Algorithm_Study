import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int w = Integer.parseInt(s[2]);
        int h = Integer.parseInt(s[3]);
        int tx = Math.min(Math.abs(x-w),x);
        int ty = Math.min(Math.abs(y-h),y);
        System.out.print(Math.min(tx,ty));
    }
}