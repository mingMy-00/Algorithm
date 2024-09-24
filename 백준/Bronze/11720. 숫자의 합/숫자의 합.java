import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
     public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int result = 0;
    String s = br.readLine();

    for(int i = 0; i < N; i++) {
      char c = s.charAt(i);
      result += ((int)c - 48);
    }
    System.out.println(result);
  }
}
