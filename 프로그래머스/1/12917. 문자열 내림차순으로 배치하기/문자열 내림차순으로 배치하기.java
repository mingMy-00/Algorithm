import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] num = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
                int str = (int)s.charAt(i);
                num[i] = str;
        }
        
        Arrays.sort(num);
        for(int i = num.length - 1; i >= 0; i-- ) {
            answer += (char)num[i];
        }
        
        
        return answer;
    }
}