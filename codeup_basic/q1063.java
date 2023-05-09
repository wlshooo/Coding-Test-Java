package codeup_basic;

import java.util.Scanner;

public class q1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int big = a>b?a:b;
        System.out.println(big);
    }
}
