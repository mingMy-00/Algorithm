class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < s.length(); i++) {
                if((int)(s.charAt(i) - 48) > 10) {
                    answer = false;
                }
            }
        }else {
            answer = false;
        }
        return answer;
    }
}