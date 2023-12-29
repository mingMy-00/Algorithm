class Solution {
    public int solution(long num) {
        
        int answer = 0;
        // num이 1이면 바로 answer에는 0 넣어서 while문 안 들어가게 하고 return함 .
        
        if(num == 1) {
            answer = 0;
        }
        
        //num이 1이 아닐 때만 들어오는데
        while (num != 1) {
            if(num % 2 == 0) {
                num = (num / 2);
                answer++; 
            }else if (num % 2 == 1) {
                num = (num * 3 + 1);
                answer++;
            }else if(num == 1) {
                 break;
                 //1되면 while문 나가게 함.
            }
        }
        //System.out.println(answer);
        //반복문 다 돌고 1이 된 시점
        if(answer >= 500) {
            answer = -1;
        }
        
     return answer;
        
    }

}