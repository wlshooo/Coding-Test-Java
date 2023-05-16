package BOJ.workbook.Ox03;

import java.util.Scanner;

//방 번호
public class q1475_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        int Nsize = n.length();
        int[] needSet = new int[10];
        int temp = 0;
        int max = 0;

        //counting 배열을 사용하였다.
        for (int i = 0; i < Nsize; i++) {
            temp = n.charAt(i) - '0';
            needSet[temp]++;
            //입력된 숫자가 있는 곳에 ++연산 수행

        }

        //6,9를 바꿔서 사용할 수 있다.
        int k = (needSet[6] + needSet[9]);
        //6,9의 합이 짝수이면 반으로 나누면 된다.
        if (k % 2 == 0) {
            needSet[6] = k / 2;
            needSet[9] = k / 2;
        } else {
            needSet[6] = k / 2 + 1;
            needSet[9] = k / 2 + 1;
        }
        //6,9의 합이 홀수이면 반으로 나눠도 1번 더 사용할 수 있기 때문에 1을 더해준다.
        //ex) 9676
        for (int i : needSet) {
            max = Math.max(max, i);
        }
        System.out.println(max);
        //가장 많은 번호가 있는 배열의 위치를 찾는다.
        //세트당 번호는 하나이기 때문이다.
    }
}
