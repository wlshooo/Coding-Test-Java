package AlgorithmBook.codeup_basic;

import java.util.Scanner;

public class q1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("[.]");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.println(String.format("%04d.%02d.%02d",year,month,day));

    }
}
