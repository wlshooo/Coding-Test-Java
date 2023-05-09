package codeup_basic;

import java.util.Scanner;

public class q1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= j; i++) {
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);
    }


}
