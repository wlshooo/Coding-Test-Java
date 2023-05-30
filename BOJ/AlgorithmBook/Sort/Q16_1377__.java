package BOJ.AlgorithmBook.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//버블 소트 프로그램1
public class Q16_1377__ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            A[i] = new mData(temp,i);
        }
        Arrays.sort(A);             // A 배열 정렬 O(nlogn) 시간 복잡도
        int max = 0;
        for (int i = 0; i < N; i++) {
            if(max<A[i].index-i)   //정렬 전 index - 정렬 후 index 계산의 최댓값 저장하기
                max=A[i].index-i;
        }
        System.out.println(max+1);
    }


    static class mData implements Comparable<mData> {

        int value;
        int index;

        public mData(int value, int index) {
            super();
            this.value= value;
            this.index= index;
        }

        @Override
        public int compareTo(mData o) {
            return this.value - o.value;
        }
    }

}
