import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
    
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine()); //한 줄 읽음. 15라는 숫자
      Deque<Integer> q = new LinkedList<>();
      StringBuilder sb = new StringBuilder();

      //N수 만큼 반복돌기
      for(int i = 0; i < N; i++) {
        String[] Arr = br.readLine().split(" ");

        switch(Arr[0]) {
          case "push" :
            q.add(Integer.parseInt(Arr[1]));
            break;
          case "pop"  :
            Integer n = q.poll();
            if(n == null) {
              sb.append(-1).append('\n');
            }else {
              sb.append(n).append('\n');
            }
            break;
          case "size" :
            sb.append(q.size()).append('\n');
            break;
          case "empty" :
            if(q.size() == 0) {
              sb.append(1).append('\n');
            }else {
              sb.append(0).append('\n');
            }
            break;
          case "front" :
             Integer n2 = q.peek();
             if(n2 == null) {
               sb.append(-1).append('\n');
             }else {
               sb.append(n2).append('\n');
             }
             break;
          case "back" :
            Integer n3 = q.peekLast();
            if(n3 == null) {
              sb.append(-1).append('\n');
            }else {
              sb.append(n3).append('\n');
            }
            break;
        }
      }
        System.out.println(sb);
  }
}