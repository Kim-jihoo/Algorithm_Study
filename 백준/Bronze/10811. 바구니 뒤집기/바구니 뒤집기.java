import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 바구니 개수
        int M = Integer.parseInt(st.nextToken());  // 역순 작업 횟수

        // 1부터 N까지의 숫자를 배열에 저장
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // M번의 역순 작업 수행
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;  // 인덱스는 0부터 시작하므로 -1
            int j = Integer.parseInt(st.nextToken()) - 1;  // 인덱스는 0부터 시작하므로 -1

            // i부터 j까지의 구간을 역순으로 변경
            reverse(baskets, i, j);
        }

        // 최종 배열 출력
        for (int b : baskets) {
            System.out.print(b + " ");
        }
    }

    // 배열의 특정 범위를 역순으로 바꾸는 함수
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
