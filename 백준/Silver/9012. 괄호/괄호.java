import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < t; i++) {
            String str = br.readLine();
            int balance = 0;
            boolean valid = true;
            
            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c =='(') {
                    balance++;
                }else if(c == ')') {
                    balance--;
                    
                    if(balance < 0) {
                        valid = false;
                        break;
                    }
                }
            }
            
            if(valid && balance ==0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            
        }
        
    }
}