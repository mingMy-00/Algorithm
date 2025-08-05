import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            String line = br.readLine().toUpperCase();
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            
            for(char c : line.toCharArray()) {
                map.put(c , map.getOrDefault(c , 0) +1);
                
                if(map.get(c) > max) {
                    max = map.get(c);
                }
            }
            
            int maxCount = 0;
            char maxValue = '?';
            
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() == max) {
                    maxCount++;
                    maxValue = entry.getKey();
                }
            }
           
            if(maxCount == 1 ) {
                System.out.println(maxValue);
            }else {
                System.out.println('?');
            }
        
    }
}