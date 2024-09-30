import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    int[] everyDay = new int[N + 1];

    everyDay[0] = 0;
    for(int i = 1; i <= N; i++) {
      everyDay[i] = everyDay[i - 1] + Integer.parseInt(st.nextToken());
    }

    int max = Integer.MIN_VALUE;

    for(int i = K; i <= N; i++) {
      int sum = everyDay[i] - everyDay[i - K];

      if(sum > max) {
        max = sum;
      }
    }

    bw.write(String.valueOf(max));
    bw.flush();
    bw.close();
  }
}