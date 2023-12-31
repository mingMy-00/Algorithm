import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        String strX = x + "";
        ArrayList<String> arr = new ArrayList<String>();
        
        //System.out.println("ss" + strX);
        for(int i = 0; i < strX.length(); i++) {
            if(strX.length() == 1) {
                if(x % x == 0) {
                    answer = true;
                }else {
                    answer = false;
                }
            }else {
                arr.add(strX.substring(i,i+1));
                //System.out.println(arr.get(i));
                sum += Integer.parseInt(arr.get(i));
                //System.out.println(sum);
                if(x % sum == 0) {
                    answer = true;
                }else {
                    answer = false;
                }
            }
        }
        return answer;
    }
}