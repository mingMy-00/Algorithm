import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
        
          Set<Integer> set = new TreeSet<>();
          for(int i  = 0 ; i < N; i++) {
             set.add(Integer.parseInt(br.readLine()));
          }        
         
          for(int n : set) {
              System.out.println(n);
          }
    }
}