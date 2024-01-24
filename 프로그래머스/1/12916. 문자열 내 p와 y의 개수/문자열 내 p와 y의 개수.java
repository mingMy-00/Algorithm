class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        long intP = 0;
        long intY = 0;
        
        for(int i  = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' ||s.charAt(i) == 'P') {
                intP++;
            }else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                intY++;
            }
        }
        
       if(intP != intY) {
           answer = false;
       }

        return answer;
    }
}