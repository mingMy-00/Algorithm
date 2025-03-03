import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            for(int j = i; j < T -1; j++) {
                System.out.print(" ");
            }
            
            for(int a = 0; a <= i; a++) {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}