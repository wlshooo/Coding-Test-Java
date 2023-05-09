package codeup_basic;

import java.io.*;

public class q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        float h = Float.valueOf(arr[0]);
        float b = Float.valueOf(arr[1]);
        float c = Float.valueOf(arr[2]);
        float s = Float.valueOf(arr[3]);
        float result = (h*b*c*s)/8/1024/1024;
        bw.write(String.format("%.1f MB",result));
        bw.flush();
    }
}
