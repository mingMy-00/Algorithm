import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int two = 2;
    int five = 5;

    int left = (n % five);
    int result = 0;

    if(n != 1 && n != 3) {
      if(left % 2 == 0 ) {
        /*나머지가 짝수면*/
        result += (n/five);
        result += (left/two);
      }else if(!(left % 2 == 0)){
        result += (n/five) - 1;
        left += five ;
        result += (left/two);
      }
    }else{
      result = -1;
    }
    System.out.println(result);
  }
}