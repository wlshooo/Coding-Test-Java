package BOJ.AlgorithmBook.DynamicProgramming;

import java.util.Scanner;

//퇴사 준비하기
public class Q85_14501_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N+2];// 오늘부터 퇴사일까지 벌 수 있는 최대 수입
        int[] T = new int[N+1];
        int[] P = new int[N+1];
        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }
        for (int i = N; i > 0; i--) {
            if (i + T[i] > N + 1) {
                D[i] = D[i + 1];
            } else {
                D[i] = Math.max(D[i+1],P[i] + D[i+T[i]]);
            }
        }
        System.out.println(D[1]);
    }
}
