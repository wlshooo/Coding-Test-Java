package BOJ.AlgorithmBook.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//K번째 수 구하기 quick sort
public class Q19_11004_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
       quickSort(A,0,N-1,K-1);
        System.out.println(A[K-1]);
    }
    public static void quickSort(int[] A, int S, int E, int K) {
        if (S < E ) {
            int pivot = partition(A,S,E);
            if(pivot==K) return; //K번째 수가 pivot이면 더 이상 구할 필요가 없음
            else if(K<pivot) quickSort(A,S,pivot-1,K);  //K가 pivot보다 작으면 왼쪽 그룹만 정렬 수핼
            else quickSort(A,pivot+1,E,K);  //K가 pivot보다 크면 오른쪽 그룹만 정렬 수행하기
        }
    }

    public static int partition(int[] A, int S, int E) {
        int M= (S+E)/2;
        swap(A,S,M);    //중앙값을 1번째 요소로 이동하기
        int pivot = A[S];
        int i=S, j=E;
        while (i < j) {
            while (pivot < A[j]) {  //피벗보다 작은 수가 나올 때까지 j--
                j--;
            }
            while (i < j && pivot >= A[i]) {   //피벗보다 큰 수가 나올 때 까지 i++
                i++;
            }
            swap(A,i,j);    //찾은 i와 j 교환
        }
        //i==j 피벗의 값을 양쪽으로 분리한 가운데에 오도록 설정하기
        A[S]=A[i];
        A[i]=pivot;
        return i;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
