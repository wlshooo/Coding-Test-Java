package codeup_basic;

import java.util.Scanner;

public class q1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int sum=a;
        for (int i = 1; i < n; i++) {
            sum+=d;
        }
        System.out.println(sum);
    }
}
