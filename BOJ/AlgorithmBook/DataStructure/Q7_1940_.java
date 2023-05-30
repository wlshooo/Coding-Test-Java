package BOJ.AlgorithmBook.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//주몽의 망령
public class Q7_1940_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //재료의 개수
        int M = Integer.parseInt(br.readLine()); //갑옷이 완성되는 번호의 합
        String[] s = br.readLine().split(" ");
        int count =0;
        int [] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.valueOf(s[i]);
        }
        Arrays.sort(A); //오름차순 정렬
        int i=0;
        int j=N-1;
        while (i < j) {
            if (A[i] + A[j] == M) {
                i++;
                j--;
                count++;
            } else if (A[i] + A[j] > M) {
                j--;
            } else if (A[i]+A[j]<M) {
                i++;
            }
        }
        System.out.println(count);
    }
}
