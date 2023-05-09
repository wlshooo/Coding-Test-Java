package codeup_basic;

import java.util.Scanner;

public class q1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < count; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
    }
}
