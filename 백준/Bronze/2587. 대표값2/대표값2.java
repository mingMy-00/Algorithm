import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 5;
        long total = 0;
        List<Long> list = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
          list.add(Long.parseLong(br.readLine()));
          total += list.get(i);
        }
        
        Collections.sort(list);
        System.out.println(total / N);
        System.out.println(list.get(2)); 
        
    }
}