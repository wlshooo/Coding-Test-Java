package BOJ.workbook.Ox03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11328_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] alpha = new int[26];
            char[] words1 = st.nextToken().toCharArray();
            char[] words2 = st.nextToken().toCharArray();
            for(char ch:words1) alpha[ch-97]++;
            for(char ch:words2) alpha[ch-97]--;
            boolean isPossible = true;
            for (int j : alpha) {
                if(j!=0) isPossible=false;
            }

            System.out.println(isPossible ? "Possible" : "Impossible");
        }
    }
}
