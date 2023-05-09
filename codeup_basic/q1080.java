package codeup_basic;

import java.util.Scanner;

public class q1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int i=1;
        int sum=0;
        while (true) {
            sum+=i;

            if (sum >= value) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
