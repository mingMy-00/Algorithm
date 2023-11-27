class Solution {
    public int solution(int left, int right) {
       
        int answer = 0;
        int count = 0;

        for(int i = left; i <= right; i++ ) {
           //13 부터 17까지 반복 
            
            for(int j = 1; j <= i; j++ ) {
               //1 부터 13까지
            
                if(i % j == 0) {
                     count++;
                 }
            } 
            
             if(count % 2 == 0) {
                    answer += i;  
                      count = 0;
                 }else {
                    answer -= i;   
                   count = 0;
                 }

            
        }
             
        return answer;
}
    
}