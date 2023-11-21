class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++)  {
            int charInt = my_string.charAt(i);
            
            if(65 <= charInt && charInt <= 90 )  {
                
                  answer += (char)(charInt + 32);
                
            }else {
                
                    answer += (char)(charInt - 32);
            }
        }
        
        return answer;
    }
}