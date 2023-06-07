package BOJ.AlgorithmBook.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//신기한 소수 찾기 - 깊이우선탐색
public class Q24_2023_ {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int number, int jarisu) {
        if (jarisu == N) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {          //짝수라면 더 이상 탐색할 필요가 없음
                continue;
            }
            if (isPrime(number * 10 + i)) {        //소수라면 재귀 함수로 자릿수를 늘림
                DFS(number * 10 + i, jarisu + 1);
            }
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
            return true;
        }
    }


