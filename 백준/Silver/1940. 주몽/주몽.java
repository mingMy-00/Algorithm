import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {
     public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());

    int[] caseArr = new int[N];
    String[] strArr = br.readLine().split(" ");

    for(int i = 0; i < N; i++) {
      caseArr[i] = Integer.parseInt(strArr[i]);
    }

    Arrays.sort(caseArr);

    int start = 0;
    int end   = N - 1;
    int result = 0;

    while(start < end) {
      if(caseArr[start] + caseArr[end] == M) {
        result++;
        start++;
        end--;
      }else if(caseArr[start] + caseArr[end] > M) {
        end--;
      }else {
        start++;
      }
    }

    bw.write(String.valueOf(result));
    bw.flush();
    bw.close();

  }
}