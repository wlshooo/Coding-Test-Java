package codeup_basic;

import java.util.Scanner;

public class q1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=1;
        int sum=0;
        while (true) {
            sum+=i;
            if (sum >= a) {
                System.out.println(sum);
                break;
            }
            i++;
        }
    }
}
