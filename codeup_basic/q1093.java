package codeup_basic;

import java.util.Scanner;

public class q1093 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[23];

        for (int i = 0; i < count; i++) {
            arr[sc.nextInt()-1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
