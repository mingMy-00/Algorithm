import java.util.StringTokenizer;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
    }
}