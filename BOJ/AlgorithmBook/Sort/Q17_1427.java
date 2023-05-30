package BOJ.AlgorithmBook.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//선택 정렬
public class Q17_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] =Integer.parseInt(split[i]);
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
