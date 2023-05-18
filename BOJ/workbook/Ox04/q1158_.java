package BOJ.workbook.Ox04;
//
//import java.io.*;
//import java.util.LinkedList;
//
//public class q1158_ {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String[] split = br.readLine().split(" ");
//        LinkedList<Integer> list = new LinkedList<>();
//        int N = Integer.parseInt(split[0]);
//        int K = Integer.parseInt(split[1]);
//
//        for (int i= 1; i<=N; i++) list.add(i);
//        System.out.print("<");
//
//        while (!list.isEmpty()) {
//            for (int i = 0; i < K; i++) {
//                if (i == K - 1) {
//                    int a = list.remove();
//                    if (list.size() == 0) {
//                        System.out.print(a);
//                    }
//                    else System.out.print(a+",");
//                }
//                else {
//                    list.add(list.remove());
//                }
//            }
//        }
//        System.out.print(">");
//    }
//}
import java.util.*;

//요세푸스
public class q1158_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        Queue<Integer> Q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++) Q.offer(i);
        sb.append('<');

        while(Q.size()!=1){
            for(int i=1; i<k; i++) Q.offer(Q.poll());
            sb.append(Q.poll()).append(", ");
        }
        sb.append(Q.poll()).append('>');
        System.out.println(sb);
    }
}