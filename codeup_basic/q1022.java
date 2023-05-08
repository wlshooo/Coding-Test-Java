package AlgorithmCodingTest.codeup_basic;

import java.util.Scanner;

public class q1022 {
    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        S=sc.nextLine();
        String[] data = S.split(" ");
        for (String datum : data) {
            System.out.print(datum+ " ");
        }
    }
}
