package BOJ.AlgorithmBook.Search;

import java.util.Scanner;

//K번째 수  - 이진탐색
public class Q31_1300_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long start = 1, end = K;
        long ans = 0;

        while (start <= end) {
            long middle = (start+end) /2;
            long cnt = 0;
            //중앙값 보다 작은 수는 몇 개 인지 계산하기
            for (int i = 1; i <= N; i++) {
                cnt+=Math.min(middle/i,N);
            }
            if (cnt < K) {
                start = middle + 1;
            } else {
                ans = middle;
                end = middle-1;
            }
        }
        System.out.println(ans);
    }
}
