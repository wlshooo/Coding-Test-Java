package codeup_basic;

import java.util.Scanner;

public class q1091 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long a = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();

        long sum=a;

        for (int i = 1; i < n; i++) {
            sum=(sum*m)+d;
        }
        System.out.println(sum);
    }
}
