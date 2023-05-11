package codeup_basic;

import java.util.Scanner;

public class q1098 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int count = sc.nextInt();
        int[][] arr = new int[h][w];
        for (int i = 0; i < count; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (d == 0) {
                for (int j = 0; j < l; j++) {
                    arr[x-1][y+j-1]=1;
                }
            } else if (d==1) {
                for (int k = 0; k < l; k++) {
                    arr[x+k-1][y-1]=1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
