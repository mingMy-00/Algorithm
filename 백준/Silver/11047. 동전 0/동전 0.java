import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
    
public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] money = new int[N];

    for(int i = 0; i < N; i++) {
      money[i] = Integer.parseInt(br.readLine());
    }

    int result = 0;
    int left = K;

    for(int i = N-1 ; i >= 0; i--) {
      if(money[i] > K) {
        continue;
      }else {
        result += (left / money[i]);
        left = (left % money[i]);
      }
    }

    bw.write(String.valueOf(result));
    bw.flush();
    bw.close();

  }
}