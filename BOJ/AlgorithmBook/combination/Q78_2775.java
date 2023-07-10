package BOJ.AlgorithmBook.combination;

import java.util.Scanner;

//부녀회장이 될 테야
public class Q78_2775 {
    static int T,N,K;
    static int[][]D;
    public static void main(String[] args) {
        D= new int[15][15];
        for (int i = 0; i < 15; i++) {
            D[i][1] = 1;
            D[0][i] =i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                D[i][j] = D[i][j-1] +D[i-1][j];
            }
        }
        Scanner sc = new Scanner(System.in);
        T =sc.nextInt();
        for (int i = 0; i < T; i++) {
            K=sc.nextInt();
            N=sc.nextInt();
            System.out.println(D[K][N]);
        }
    }
}
