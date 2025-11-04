import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            String order = arr[0];

            switch (order) {
                case "push":
                    dq.offerLast(Integer.parseInt(arr[1]));
                    break;

                case "pop":
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append('\n');
                    break;

                case "size":
                    sb.append(dq.size()).append('\n');
                    break;

                case "empty":
                    sb.append(dq.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n');
                    break;

                case "back":
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}
