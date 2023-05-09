package codeup_basic;

import java.io.*;


public class q1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = br.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < Integer.valueOf(a[0]); i++) {
            for (int j = 0; j < Integer.valueOf(a[1]); j++) {
                for (int k = 0; k < Integer.valueOf(a[2]); k++) {
                    count++;
                    bw.write(i+" "+j+" "+k+" "+"\n");
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
