package BOJ.AlgorithmBook.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//원하는 정수 찾기 - 이진탐색
public class Q29_1920_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());

            //이진탐색 시작
            int start = 0;
            int end =A.length-1;
            while (start <= end) {
                int midi =(start+end)/2;
                int midV = A[midi];
                if (midV > target) {
                    end = midi-1;
                } else if (midV < target) {
                    start = midi + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
