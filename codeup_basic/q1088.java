package codeup_basic;

import java.util.Scanner;

public class q1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            if(i%3==0) continue;
            System.out.print(i+" ");
        }
    }
}
