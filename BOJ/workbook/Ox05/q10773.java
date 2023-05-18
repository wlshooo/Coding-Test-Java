package BOJ.workbook.Ox05;

import java.io.*;
import java.util.Stack;


public class q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer>stack=new Stack<>();
        int num = Integer.parseInt(br.readLine());

        int i=0;
        while (i <num) {
            int value = Integer.parseInt(br.readLine());
            if(value==0) stack.pop();
            else stack.push(value);
            i++;
        }
        int sum=0;
        for (Integer integer : stack) {
            sum+=integer;
        }
        System.out.println(sum);

    }
}
