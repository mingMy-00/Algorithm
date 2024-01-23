import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
       //빵 1 , 야채 2, 고기 3
       
       //Stack 선언
       
        //변수 선언
        Stack<Integer> ham = new Stack<>();
        int sz = 0;
        int answer = 0;
        
       for(int i = 0; i < ingredient.length; i++) {
           ham.push(ingredient[i]);
           if(ham.size() >= 4) {
               sz = ham.size();
               if(ham.get(sz - 1) == 1 
                   && ham.get(sz - 2) == 3 
                   && ham.get(sz - 3) == 2 
                   && ham.get(sz - 4) == 1 )  {

                   answer++;
                   ham.pop();
                   ham.pop();
                   ham.pop();
                   ham.pop();
               }
            }
        }
                
        return answer;
    }
}