import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
public class Main {
    public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int K =  Integer.parseInt(br.readLine());
    Stack<Integer> st = new Stack<>();

    for(int i =0; i < K; i++) {
      int n = Integer.parseInt(br.readLine());
      if(n != 0) {
        st.push(n);
      }else {
        st.pop();
      }
    }

    int answer = 0;
     if(!st.isEmpty()) {
       while(!st.isEmpty()) {
         int n = st.pop();
         answer += n;
       }
       System.out.println(answer);

     }else {
       System.out.println(0);
     }
  }
}