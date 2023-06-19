package BOJ.AlgorithmBook.NumberTheory;

import java.util.Scanner;

//제곱이 아닌 수 찾기
public class Q40_1016__ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long Min = sc.nextLong();
        long Max = sc.nextLong();

        boolean[] Check = new boolean[(int)(Max-Min+1)];

        for (long i = 2; i * i <= Max; i++) {
            long pow = i*i;
            long start_index = Min/pow;
            if (Min % pow != 0) {
                start_index++;
            }
            for (Long j = start_index; pow * j <= Max; j++) {
                Check[(int)((j*pow)-Min)] = true;
            }
        }
        int count = 0;
        for (int i = 0; i <= Max - Min; i++) {
            if (!Check[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

}
