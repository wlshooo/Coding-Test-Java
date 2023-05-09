package codeup_basic;

import java.util.Scanner;

public class q1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int j = c - '0';

        for(int i=49; i<=j;i++)
        {
            char i1 =(char)(i + '0');
            System.out.print(i1+" ");
        }


    }
}
