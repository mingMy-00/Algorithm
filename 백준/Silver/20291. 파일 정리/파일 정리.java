import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            int dotIndex = str.indexOf('.');
            String afterDot = str.substring(dotIndex + 1);
            
            map.put(afterDot , map.getOrDefault(afterDot , 0) + 1);
            
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}