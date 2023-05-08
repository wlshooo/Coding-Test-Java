package AlgorithmCodingTest.codeup_basic;

import java.util.Scanner;

public class q1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.next().split("");
        int[] num=new int[split.length];
        for (int i=0; i<split.length;i++)
        {
            num[i] = Integer.parseInt(split[i]);
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-i-1; j++) {
                num[i]=num[i]*10;
            }
            System.out.println("["+num[i]+"]");
        }
    }
}
