import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>(N);
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            reverseSubList(list, start, end);
        }

        // 성능 개선: StringBuilder로 출력 최적화
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());

        br.close();
    }

    private static void reverseSubList(List<Integer> list, int start, int end) {
        // LinkedList → ArrayList 변경하여 성능 개선
        Collections.reverse(list.subList(start, end + 1));
    }
}
