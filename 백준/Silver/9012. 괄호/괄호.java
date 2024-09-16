import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      System.out.println(solve(sc.next()));
    }
  }

  private static String solve(String s) {

    Stack<Character> st = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(') {
        st.push(c);
      } else if (st.isEmpty()) {
        return "NO";
      } else {
        st.pop();
      }
    }

    if (st.isEmpty()) {
      return "YES";
    } else {
      return "NO";
    }
  }
 }