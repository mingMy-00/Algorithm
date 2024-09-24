import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    HashMap<Integer, String> map1 = new HashMap<>();
    HashMap<String, Integer> map2 = new HashMap<>();
    StringBuilder sb = new StringBuilder();
        
    for(int i = 1; i <= N; i++) {
      String s = br.readLine();
      map1.put(i, s);
      map2.put(s, i);
    }

    for(int i = 0; i < M; i++) {
          String s = br.readLine();
          char c = s.charAt(0);
      if(Character.isDigit(c)) {
          sb.append(map1.get(Integer.parseInt(s)));
          sb.append("\n");
      }else {
          sb.append(map2.get(s));
          sb.append("\n");
      }
    }
      System.out.println(sb);
  }
}