import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;

public class Main {
      public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String s = br.readLine();

                BigInteger N = new BigInteger(s, 2);
                
                String result = N.toString(8);

                System.out.println(result);


    }
}