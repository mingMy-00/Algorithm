class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
    for(char c : s.toCharArray()) {   
         for(int i =0; i<n; i++ )  {
           int ich = (int)c;
            if(ich == 32) {
                c = 32;
            }else {
            
             if(ich == 122) {
                 c = 97;
             }else if(ich == 90){
                 c = 65;
             }else {
                 ++c;
             }
            }
         }
      answer += (char)c;   
     }
         return answer;
    }
        
}



