import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;
public class Main {
    public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    Stack<Character> st = new Stack<>();
    int result = 0;
    int tmp = 1;

    L1 : for(int i =0; i < s.length(); i++) {
      char c = s.charAt(i);

      switch(c) {
        case '(' :
          st.push(c);
          tmp *= 2;
          break;
        case '[' :
          st.push(c);
          tmp *= 3;
          break;
        case ')' :
          if(st.isEmpty() || st.peek() != '(') {
            result = 0;
            break L1;
          }else {
            if(s.charAt(i-1) == '(') {
              result += tmp;
            }
            st.pop();
            tmp /= 2;
          }
          break;
        case ']' :
          if(st.isEmpty() || st.peek() != '[') {
            result = 0;
            break L1;
          }else {
            if(s.charAt(i-1) == '[') {
              result += tmp;
            }
            st.pop();
            tmp /= 3;
          }
          break;
      }
    }

    if(!st.isEmpty()) {
      System.out.println(0);
    }else {
      System.out.println(result);
    }
  }
}