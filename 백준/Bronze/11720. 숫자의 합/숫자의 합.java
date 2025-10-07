import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arrC = br.readLine().toCharArray();
        int result = 0;
        
        for(int i = 0; i < n; i++) {
            result += (arrC[i] - 48);
        }
        
        System.out.println(result);
    }
}