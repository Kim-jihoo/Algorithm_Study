import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [][] arr= new String[n][2];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr,(a,b)->{
            if(!a[0].equals(b[0])){
                int ageA = Integer.parseInt(a[0]);
                int ageB = Integer.parseInt(b[0]);
                return ageA-ageB;
            }else{
                return 0;
            }
        });
        for(int i=0; i<n; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}