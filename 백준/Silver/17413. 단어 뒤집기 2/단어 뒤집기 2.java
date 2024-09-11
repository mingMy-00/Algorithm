import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        //<ab cd>fe hg<ij kl>
        //noojkeab enilno egduj

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '<') {
                flag = false; 

                    if(!st.isEmpty()) {
                        while(!st.isEmpty()) {
                            sb.append(st.pop());
                        }
                    }
                sb.append(c);
                
            }else if (c == '>') {
                flag = true;
                sb.append(c);
            }else if(!flag) {
                sb.append(c);
            }else {
                if(c == ' ') {
                    while(!st.isEmpty()) {
                        sb.append(st.pop());
                    }
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
        br.close();
    }
}
