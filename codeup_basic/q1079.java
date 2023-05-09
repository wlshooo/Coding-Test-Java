package codeup_basic;

import java.util.Scanner;

public class q1079 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (true) {
            char c = sc.next().charAt(0);
            if (c == 'q') {
                System.out.println(c);
                break;
            }
            else System.out.println(c);
        }
    }
}
