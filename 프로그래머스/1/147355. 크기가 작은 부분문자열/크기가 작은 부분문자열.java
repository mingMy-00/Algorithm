import java.util.ArrayList;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        ArrayList<Long> sub = new ArrayList<>();
        
        for(int i=0; i< (t.length() - p.length()+1); i++) {
    sub.add( Long.parseLong(t.substring(i, p.length()+i)));
            
            
if(sub.get(i) <= Long.parseLong(p)){
++answer;
}
            
        
}

        return answer;
    }
}