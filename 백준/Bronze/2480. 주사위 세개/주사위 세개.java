import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());
        
        if(n1 == n2 && n2 == n3) {
            System.out.println(10000 + (n1 * 1000));
        }else if(n1 == n2 || n2 == n3 || n3 == n1) {
            if(n1 == n2 || n3 == n1) {
                System.out.println(1000 + (n1 * 100));
            }else {
                 System.out.println(1000 + (n2 * 100));
            }
        }else {
            int max = Math.max(Math.max(n1, n2) , n3);
            System.out.println(max * 100);
        }
    }
}