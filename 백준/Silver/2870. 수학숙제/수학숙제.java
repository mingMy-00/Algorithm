import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class Main {
    
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int N = Integer.parseInt(br.readLine());
    List<BigInteger> answer = new ArrayList<>();
    
    for(int i = 0; i < N; i++) {
      String s = br.readLine();
      StringBuilder sb = new StringBuilder();

      for(int j =0; j < s.length(); j++) {
        char c = s.charAt(j);

        if(Character.isDigit(c)) {
          sb.append(c);
        }else {
          if(sb.length() > 0) {
              BigInteger num = new BigInteger(sb.toString());
              answer.add(num);
              sb = new StringBuilder();
          }
        }
      }
      if(sb.length() > 0) {
        BigInteger num = new BigInteger(sb.toString());
        answer.add(num);
      }
    }
      Collections.sort(answer);

      for(BigInteger num : answer) {
        bw.write(num.toString() + "\n");
      }
      
         bw.flush();
        bw.close();
  }
}