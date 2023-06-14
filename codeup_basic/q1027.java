package BOJ.AlgorithmBook.codeup_basic;

import java.util.Scanner;

public class q1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.next().split("[.]");
        int[]date = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            date[i]=Integer.parseInt(split[i]);
        }
        int year =date[0];
        int month =date[1];
        int day =date[2];
        System.out.printf("%02d-%02d-%04d",day,month,year);
    }
}
