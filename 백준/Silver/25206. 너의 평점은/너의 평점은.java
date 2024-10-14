import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum=0;
        double n=0;
        for(int i=0; i<20;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            
            String course = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            
            if(grade.equals("P")){
                continue;
            }
            sum = sum+ credit*solution(grade);
            n+=credit;
        }
            double average = sum/n;
            System.out.println(average);
    }
    public static double solution(String grade){
        double g = 0;
        if(grade.equals("A+")){
            g=4.5;
        }else if(grade.equals("A0")){
            g= 4.0;
        }else if(grade.equals("B+")){
            g= 3.5;
        }else if(grade.equals("B0")){
            g= 3.0;
        }else if(grade.equals("C+")){
            g= 2.5;
        }else if(grade.equals("C0")){
            g= 2.0;
        }else if(grade.equals("D+")){
           g= 1.5;
        }else if(grade.equals("D0")){
            g= 1.0;
        }else if(grade.equals("F")){
            g= 0.0;
        }
        return g;
    }
}