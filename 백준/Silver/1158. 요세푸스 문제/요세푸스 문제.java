import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    List<Integer> people = new LinkedList<>();

    for(int i = 1; i <= N; i++) {
      people.add(i);
    }

    List<Integer> YosepList = new LinkedList<>();
    int index = 0;
    while(!people.isEmpty()) {
      //인덱스 계산하기
      index = (index + K -1 ) % people.size();
      YosepList.add(people.remove(index));
    }
    System.out.print("<");

    for(int i = 0 ; i < YosepList.size(); i++) {
      if (i == YosepList.size() - 1) {
        System.out.print(YosepList.get(i));
      } else {
        System.out.print(YosepList.get(i) + ", ");
      }
    }
    System.out.print(">");
  }
 }