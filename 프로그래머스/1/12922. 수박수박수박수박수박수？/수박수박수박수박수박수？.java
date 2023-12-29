import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        String one = "수";
        String two = "박";
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                arr.add(one);
            }else {
                arr.add(two);
            }   
            //System.out.println(arr.get(i));
        }
       
        for(String strArr : arr) {
            answer += strArr;
        }
        return answer;
    }
}