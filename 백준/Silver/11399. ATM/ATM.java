import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        
        int prev = 0;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += prev + arr[i];
            prev +=arr[i];
        }
        System.out.println(sum);
    }
}