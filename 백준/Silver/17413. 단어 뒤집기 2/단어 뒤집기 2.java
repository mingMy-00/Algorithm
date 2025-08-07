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
                stackPop(st, sb);
                sb.append(c);
            }else if(c =='>') {
                isTag = false;
                sb.append(c);
            }else if(c == ' ') {
                stackPop(st, sb);
                sb.append(c);
            }else {
                if(isTag) {
                    sb.append(c);
                }else {
                    st.push(c);
                }
            }
        }
       
        stackPop(st, sb);
        System.out.println(sb);
  
    }
    
    private static void stackPop(Stack<Character> st, StringBuilder sb) {
        while(!st.isEmpty()) {
                      sb.append(st.pop());
        }
    }
    
    
}