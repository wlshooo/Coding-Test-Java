package BOJ.AlgorithmBook.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//절대값 힙 구하기
public class Q14_11286__ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) { //절댓값이 같은 경우
                return o1 > o2 ? 1 : -1;
                //o1이 더 크다면 양수 반환 -> o1과 o2의 자리를 바꾼다
                //o1이 더 작다면 음수 반환 -> 지금의 자리를 유지한다
            } else { //절댓값이 같지 않은 경우 절댓값이 작은 순서로 정렬한다
                return Math.abs(o1) - Math.abs(o2);
                //양수가 반환되면 o1의 절댓값이 더 큰 경우이다 -> o2, o1순으로 정렬
                //음수가 반환되면 o2의 절대값이 더 큰 경우이다 -> o1, o2 유지
            }
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            } else {
                queue.add(request);
            }

        }

    }
}
