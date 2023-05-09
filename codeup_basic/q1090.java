package codeup_basic;

import java.util.Scanner;

public class q1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long r = sc.nextLong();
        Long d = sc.nextLong();

        Long sum = a;
        for (int i = 1; i < d; i++) {
            sum*=r;
        }
        System.out.println(sum);
    }
}
