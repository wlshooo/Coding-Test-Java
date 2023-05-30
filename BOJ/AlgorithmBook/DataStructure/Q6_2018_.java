package BOJ.AlgorithmBook.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//투 포인터 - 연속된 자연수의 합 구하기
public class Q6_2018_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count =1;
        int start_index =1;
        int end_index=1;
        int sum=1;

        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum=sum+end_index;
            } else if (sum > N) {
                sum=sum-start_index;
                start_index++;
            } else if (sum<N) {
                end_index++;
                sum=sum+end_index;
            }
        }
        System.out.println(count);
    }
}
