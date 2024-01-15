class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        int sum   = 0;
        int leave = 0;
        for(int arrI : arr) {
            sum += arrI;
        }
        
        answer = (double)sum / arr.length;
        return answer;
    }
}