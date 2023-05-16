package BOJ.workbook.Ox03;

import java.util.Scanner;

//알파벳 개수
public class q10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        int[] count = new int[26];

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            int i1 = (int) ch - 97;
            count[i1]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
