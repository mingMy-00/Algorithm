import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        
        int[] answer = {};
        
        ArrayList<Integer> nn = new ArrayList<>();
        ArrayList<Integer> mm = new ArrayList<>();
        
        //최대 공약수 구하기 
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                nn.add(i);
            }
        }
        
        for(int i = 1; i <= m; i++) {
            if(m % i == 0) {
                nn.add(i);
            }
        }
        
        for(int nnn : nn) {
            System.out.println(nnn);
        }
        
        
        return answer;
    }
}