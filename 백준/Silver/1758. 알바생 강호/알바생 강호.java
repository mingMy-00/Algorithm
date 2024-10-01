import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class Main {
    
public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int tip[] = new int[N];

    for(int i = 0; i < N; i++) {
      tip[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(tip);

    int num = 1;
    long result = 0;
    int realTip = 0;

    for(int i = N -1; i >= 0; i--) {
      realTip = (tip[i] - (num - 1));
      if(realTip > 0) {
        result += realTip;
      }else {
         break;
      }
      num++;
    }

    bw.write(String.valueOf(result));
    bw.flush();
    bw.close();
  }
}