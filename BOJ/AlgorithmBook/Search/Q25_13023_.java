package BOJ.AlgorithmBook.Search;

import java.util.ArrayList;
import java.util.Scanner;

//친구 관계 파악하기 - 깊이우선탐색
public class Q25_13023_ {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    static boolean arrive;
    public static void main(String[] args) {
        int N; //노드 개수
        int M; //에지 개수
        arrive = false;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        A=new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        for (int i = 0; i < N; i++) {
            DFS(i,1);
            if(arrive)
                break;
        }
        if(arrive)
            System.out.println("1");
        else
            System.out.println("0");    //5의 깊이가 없다면 0 출력
    }

    public static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {     //depth가 5가 되면 프로그램 종료
            arrive=true;
            return;
        }
        visited[now] = true;
        for (int i : A[now]) {
            if (!visited[i]) {
                DFS(i,depth+1);         //재취 호출이 될 때마다 depth를 1씩 증가
            }
        }
        visited[now] = false;
    }
}
