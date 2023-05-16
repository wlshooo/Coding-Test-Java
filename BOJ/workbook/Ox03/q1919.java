package BOJ.workbook.Ox03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//애너그램 만들기
public class q1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] first = br.readLine().toCharArray();
        char[] second = br.readLine().toCharArray();
        int count =0;
           int[] Falpha = new int[26];
           int[] Salpha = new int[26];
           for(char ch:first) Falpha[ch-97]++;
           for(char ch:second) Salpha[ch-97]++;
            for (int i = 0; i < Falpha.length; i++) {
                if (Falpha[i]>Salpha[i]) {
                    count=count+Falpha[i]-Salpha[i];
                } else if (Falpha[i]<Salpha[i]) {
                    count=count+Salpha[i]-Falpha[i];
                }
            }
        System.out.println(count);
    }
}
