class Solution {
    public String solution(String s) {
         String answer = "";
         char   charAnswer = ' ';
        int num = 0;
        if(s.length() % 2 == 0) {
            num = (s.length() / 2 );
            answer += s.charAt(num-1);
            answer += s.charAt(num);
        }else {
           num = ((s.length() - 1) / 2 );
           charAnswer = s.charAt(num);
            answer = charAnswer + "";
        }
        return answer;
    }
}