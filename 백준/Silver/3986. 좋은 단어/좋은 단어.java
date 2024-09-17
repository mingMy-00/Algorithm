import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {   
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); //한 줄 읽음. 3이라는 숫자
    int cnt = 0;

    for(int i = 0; i < N; i++) {

      String s = br.readLine();
      Stack<Character> st = new Stack<>();

      for(int j =0; j <s.length(); j++) {
          if(st.size() > 0 && st.peek() == s.charAt(j)) {
                st.pop();
          }else {
            st.push(s.charAt(j));
          }
      }
      if(st.isEmpty()) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }
} 