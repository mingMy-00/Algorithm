import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < t; i++) {
            String str = br.readLine();
            Stack st = new Stack();
            boolean flag = true;
            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c =='(') {
                    st.push(c);
                }else if(c == ')') {
                    if(!st.isEmpty() ){
                         st.pop();
                    }else {
                        flag = false;
                    }
                }
            }
            
            if(!st.isEmpty() || !flag) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
            
        }
        
    }
}