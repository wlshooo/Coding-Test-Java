package codeup_basic;

import java.util.Scanner;

public class q1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i>=90&&i<=100) System.out.println("A");
        else if (i>=70&&i<=89) System.out.println("B");
        else if (i>=40&&i<=69) System.out.println("C");
        else if (i>=0&&i<=39) System.out.println("D");

    }
}
