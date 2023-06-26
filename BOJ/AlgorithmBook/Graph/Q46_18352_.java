package BOJ.AlgorithmBook.Graph;

import java.util.*;

//특정 거리의 도시 찾기
public class Q46_18352_ {
    static int visited[];
    static ArrayList<Integer>[] A;
    static List<Integer> answer;
    static int N,M,K,X;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //노드 수
        int M = sc.nextInt();   //엣지 수
        int K = sc.nextInt();   //엣지 수
        int X = sc.nextInt();   //엣지 수
        A = new ArrayList[N+1];
        answer = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
        }
        visited = new int[N+1];     //방문 배열 초기화하기
        for (int i = 0; i <= N; i++) {
            visited[i] = -1;
        }
        BFS(X);
        for (int i = 0; i <= N; i++) {
            if (visited[i] == K) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(answer);
            for (int temp : answer) {
                System.out.println(temp);
            }
        }
    }
    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node]++;
        while (!queue.isEmpty()) {
            int now_Node = queue.poll();
            for (int i : A[now_Node]) {
                if (visited[i] == -1) {
                    visited[i] = visited[now_Node]+1;
                    queue.add(i);
                }
            }
        }
    }
}
