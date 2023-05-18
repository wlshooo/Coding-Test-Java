package BOJ.workbook.Ox05;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

//스택
public class q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Stack<Integer>stack=new Stack<>();
        int i=0;
        while (i < num) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "top":
                    if(stack.isEmpty()) bw.write(-1+"\n");
                    else bw.write(stack.peek()+"\n");
                    break;
                case "pop":
                    if(stack.isEmpty()) bw.write(-1+"\n");
                    else bw.write(stack.pop()+"\n");
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    if(stack.isEmpty()) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;

                default:
                    break;

            }
            i++;
        }
        bw.flush();
        bw.close();

    }
}
