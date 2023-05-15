package BOJ.workbook.Ox03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[Integer.parseInt(sArr[i])]++;
        }

        System.out.println(iArr[v]);
        br.close();
    }
}
