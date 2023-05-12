package AlgorithmBook.codeup_basic;

import java.util.Scanner;

public class q1020 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] split = sc.next().split("\\-");
        for (String s : split) {
            System.out.print(s);
        }
    }
}
