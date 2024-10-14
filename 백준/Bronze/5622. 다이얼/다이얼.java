import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str= br.readLine().split("");
        int sum=0;
        for(int i=0; i<str.length;i++){
            String ch = str[i];
            if (ch.equals("A") || ch.equals("B") || ch.equals("C")) {
                sum += 3;
            } else if (ch.equals("D") || ch.equals("E") || ch.equals("F")) {
                sum += 4;
            } else if (ch.equals("G") || ch.equals("H") || ch.equals("I")) {
                sum += 5;
            } else if (ch.equals("J") || ch.equals("K") || ch.equals("L")) {
                sum += 6;
            } else if (ch.equals("M") || ch.equals("N") || ch.equals("O")) {
                sum += 7;
            } else if (ch.equals("P") || ch.equals("Q") || ch.equals("R") || ch.equals("S")) {
                sum += 8;
            } else if (ch.equals("T") || ch.equals("U") || ch.equals("V")) {
                sum += 9;
            } else if (ch.equals("W") || ch.equals("X") || ch.equals("Y") || ch.equals("Z")) {
                sum += 10;
            }
        }System.out.println(sum);
    }
}