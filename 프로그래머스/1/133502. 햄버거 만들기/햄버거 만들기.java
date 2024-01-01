import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        
        int answer = 0;
        ArrayList<String> str = new ArrayList<String>();
        String strArr = "";
        
        for(int i = 0; i < ingredient.length; i ++) {
            switch(ingredient[i]) {
                case 1 : str.add("빵");   break;
                case 2 : str.add("야채"); break;
                case 3 : str.add("고기"); break;
            }
        }
        
        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();

        for(int i = 0; i <= (str.size() - 4); i++) { 
            arr.add(new ArrayList<String>()); // ArrayList<String>를 초기화하고 추가
            
            for(int j = i; j < (i + 4); j++) {
                arr.get(i).add(str.get(j));
            }
            
            strArr = "";
            for(int a = 0; a < 4; a++) {
                strArr += arr.get(i).get(a);   
                if(strArr.equals("빵야채고기빵")) {
                    answer++;
                }
            }
        }

        return answer;
       
    }
}