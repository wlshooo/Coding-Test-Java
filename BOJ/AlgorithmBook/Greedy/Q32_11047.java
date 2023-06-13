package BOJ.AlgorithmBook.Greedy;

import java.util.Scanner;

//동전 개수의 최소값 구하기 - 그리디 알고리즘
public class Q32_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[]A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] <= K) {
                count+= (K/A[i]);
                K = K % A[i];
            }
        }
        System.out.println(count);
    }
}
