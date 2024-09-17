import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {   
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); //한 줄 읽음. 3이라는 숫자
    int cnt = 0;

    for(int i = 0; i < N; i++) {

      char[] chars = br.readLine().toCharArray();
      Deque<Character> dq = new ArrayDeque<>();

      for(char c : chars) {
          if(dq.size() > 0 && dq.peek() == c) {
              dq.pop();
          }else {
              dq.push(c);
          }
      }
      if(dq.isEmpty()) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }
} 