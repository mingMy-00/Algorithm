import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] cArr = br.readLine().toUpperCase().toCharArray();
        int max = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(char c : cArr) {
            map.put(c , map.getOrDefault(c, 0) + 1);
            if(map.get(c) > max) {
                max = map.get(c);
            }
        }
        
        int maxCount = 0;
        char maxValue = '?';
        
        for(Map.Entry<Character , Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                maxCount++;
                maxValue = entry.getKey();
            }
        }
        
        if(maxCount == 1) {
            System.out.println(maxValue);
        }else {
            System.out.println('?');
        }
    }
}