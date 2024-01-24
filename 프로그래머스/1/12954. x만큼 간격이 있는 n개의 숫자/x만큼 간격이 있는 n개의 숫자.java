class Solution {
    public long[] solution(int x, int n) {
        
        long num = 0;
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i ++) {
            answer[i] = (num + x);
            num = answer[i];
        }
        
        
        return answer;
    }
}