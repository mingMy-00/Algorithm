import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < T; i++) {

      char[] c = br.readLine().toCharArray();
      int[] num = new int[26];

      for(int j = 0; j < c.length; j++) {

        if(c[j] >= 'a' && c[j] <= 'z') {
            num[c[j] - 'a'] += 1;
        }

      }

      int max = 0;
      int n = 0;
      boolean duplicate = false;

      for(int k =0; k < num.length; k++) {
        if(num[k] > max) {
          max = num[k];
          n = k;
          duplicate = false;
        }else if (num[k] == max) {
          duplicate = true;
        }
      }

      if(duplicate) {
        sb.append("?");
      }else {
        sb.append((char)(n + 97));
      }
       sb.append("\n");
    }

    System.out.println(sb);

  }
}
