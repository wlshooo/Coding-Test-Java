package BOJ.workbook.Ox03;

import java.util.Scanner;

public class q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a*b*c;
        int temp=result;
        int Arrcount =0;
        while (true) {
            temp = temp / 10;
            if (temp == 0)
            {   Arrcount++;
                break;
            }
            Arrcount++;
        
        }
        int[] count = new int[10];
        for (int i = 0; i < Arrcount; i++) {
            int remain = result%10;
            count[remain]++;
            result=result/10;
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(count[j]);
        }
    }
}
