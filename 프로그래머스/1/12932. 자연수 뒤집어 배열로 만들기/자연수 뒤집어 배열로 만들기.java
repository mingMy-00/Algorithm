class Solution {
    public int[] solution(long n) {
        
        String strN = n + "";
        int[] answer = new int[strN.length()];

        for(int i = 0; i <= strN.length() - 1; i++) {
            answer[i] = strN.charAt(strN.length()-(i + 1)) - '0';
        }
        
        return answer;
    }
}