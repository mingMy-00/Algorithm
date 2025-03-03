import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
       
        String s = "*";
        for(int i = 0; i < T; i++) {
            System.out.println(s);
            s += "*";
        }
    }
}