import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력을 받아서 공백 기준으로 나누기
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        
        // solution 함수 호출
        Solution sol = new Solution();
        int[] result = sol.solution(A, B);
        
        // 결과 출력
        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] solution(int A, int B) {
        int[] result = new int[5];
        result[0] = A + B;
        result[1] = A - B;
        result[2] = A * B;
        result[3] = A / B;
        result[4] = A % B;
        return result;
    }
}
