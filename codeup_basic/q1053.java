package codeup_basic;

import java.util.Scanner;

public class q1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==1)
            i=0;
        else if (i==0) i=1;

        System.out.println(i);
    }
}
