import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    for(int i = 0; i < T; i++) {

      int n = Integer.parseInt(br.readLine());
      Map<String, Integer> clothes = new HashMap<>();

      for(int j = 0; j < n; j++) {
        String[] clothesInfo = br.readLine().split(" ");
        String clothesType = clothesInfo[1];
        clothes.put(clothesType, clothes.getOrDefault(clothesType ,  0) +1 );
      }

      int result = 1;
      for(int count : clothes.values()) {
        result *= (count + 1);
      }

      result -= 1;

      System.out.println(result);
    }
  }
}