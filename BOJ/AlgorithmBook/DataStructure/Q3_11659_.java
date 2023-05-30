package BOJ.AlgorithmBook.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 구간 합 구하기
 *
 * 수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 구하는 프로그램을 작성하시오.
 *
 * 입력 -> 1번째 줄에 수의 개수 N(1<= N <= 100,000), 합을 구해야 하는 횟수 M(1<= M <= 100,000),
 * 2번째 줄에 N개의 수가 주어진다. 각 수는 1,000보다 작거나 같은 자연수다. 3번째 줄부터는 M개의 줄에 합을 구해야 하는
 * 구간 i아 j가 주어진다
 *
 * 출력 ->총 M개의 줄에 입력으로 주어진 i번째 수에서 j번째 수까지의 합을 출력한다.
 */
public class Q3_11659_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] S = new int[N+1];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            S[i]=S[i-1]+Integer.parseInt(stringTokenizer.nextToken());  //합배열
        }

        for (int q = 0; q < M; q++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);    //구간 합
        }
    }
}
