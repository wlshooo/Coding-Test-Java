package AlgorithmCodingTest.codeup_basic;

import java.util.Scanner;

public class q1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr =s.split(":");
        int[] time = new int[2];
        for (int i = 0; i<arr.length; i++) {
            time[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(time[0]+":"+time[1]);
    }
}
