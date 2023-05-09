package codeup_basic;

import java.util.Scanner;

public class q1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hex = Integer.valueOf(sc.next(), 16);

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n",hex,i,hex*i);
        }

    }
}
