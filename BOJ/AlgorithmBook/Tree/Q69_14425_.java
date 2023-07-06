package BOJ.AlgorithmBook.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//순서가 뒤바뀜 73번 문제 다음에 69번 문제가 나옴
//문자열 찾기
public class Q69_14425_ {
    public static void main(String args[]) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        int cnt = 0;

        for(int i=0; i<M; i++) {
            String s = br.readLine();
            if(set.contains(s)) {
                cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt+"\n");

        System.out.println(sb);
        br.close();
    }
}
