package AlgorithmCodingTest.codeup_basic;

import java.util.Scanner;

public class q1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("[.]");
        System.out.println(split[0]);
        System.out.println(split[1]);
    }
}
