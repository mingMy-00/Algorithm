import java.util.*;
class Solution {
    public long solution(long n) {
    
    long answer = 0;
    String num = n + "";
    String str = "";
    String[] arr = new String[num.length()];
        for(int i = 0; i < num.length(); i++) {
           arr[i] = num.substring(i, i+1); 
        }
        
         Arrays.sort(arr);
        
        for(int i = arr.length -1; i >= 0; i--) {
            str += arr[i];
            answer = Long.parseLong(str);
        }
        return answer;
    }
}