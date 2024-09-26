import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;

public class Main {
   
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    String[] cardList = br.readLine().split(" ");
    Map<String, Integer> countMap = new HashMap<>();

    for(int i = 0; i < N; i++) {
      String card = cardList[i];
      countMap.put(card ,countMap.getOrDefault(card, 0)+1);
    }

    int M = Integer.parseInt(br.readLine());
    String[] cardList2 = br.readLine().split(" ");
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < M; i++) {
      String card = cardList2[i];

      sb.append(countMap.getOrDefault(card, 0)).append(" ");
    }
    System.out.println(sb);
  } 
}