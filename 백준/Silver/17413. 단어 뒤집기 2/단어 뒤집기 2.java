import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder();
        boolean isTag = false;
        for(int i =0; i < str.length(); i++) {
            
            char c = str.charAt(i);
            
            if(c == '<') {
                isTag = true;
                if(!st.isEmpty()) {
                    while(!st.isEmpty()) {
                        sb.append(st.pop());
                    }
                }
                sb.append(c);
            }else if(c =='>') {
                isTag = false;
                sb.append(c);
            }else if(c == ' ') {
                while(!st.isEmpty()) {
                      sb.append(st.pop());
                }
                sb.append(c);
            }else {
                if(isTag) {
                    sb.append(c);
                }else {
                    st.push(c);
                }
            }
        }
        
        if(!st.isEmpty()) {
            while(!st.isEmpty()) {
                sb.append(st.pop());
            }
        }
        
       System.out.println(sb);
  
    }
    
}