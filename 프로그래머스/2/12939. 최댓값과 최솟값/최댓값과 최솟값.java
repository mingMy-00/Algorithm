import java.util.*;
class Solution {
    public String solution(String s) {
       
        String[] numbers = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i =0; i<numbers.length; i++) {
           int num = Integer.parseInt(numbers[i]);
           min = Math.min(min,num);
           max = Math.max(max,num);
        }
        
        return min + " " + max;
    }
}