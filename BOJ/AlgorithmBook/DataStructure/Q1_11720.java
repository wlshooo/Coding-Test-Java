package BOJ.AlgorithmBook.DataStructure;

import java.util.Scanner;

/**
 * 숫자의 합 구하기
 *
 * N개의 숫자가 공백 없이 써 있다. 이숫자를 모두 합해 출력하는 프로그램을 작성하시오.
 */
public class Q1_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();   //문자열 sNum -> Char형 배열로 변환
        int sum =0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] -'0';        //문자열에서 '0' 을 빼주어 숫자로 만든 뒤 합계산
        }
        System.out.println(sum);

    }
}
