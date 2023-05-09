package codeup_basic;

import java.util.Scanner;

public class q1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i]=sc.nextInt();
        }
        for(int i=count-1; i>=0; i--)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
