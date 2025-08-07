import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        String[] fixs = br.readLine().split("\\*");
        String prefix = fixs[0];
        String suffix = fixs[1];

        for(int i = 0; i < T; i++) {
           String fileName = br.readLine();
           boolean matches = fileName.startsWith(prefix) && fileName.endsWith(suffix);
            
            if (fileName.length() < prefix.length() + suffix.length()) {
                System.out.println("NE");
                continue;
            }

            
           if(matches) {
               System.out.println("DA");
           }else {
               System.out.println("NE");
           }
            
        }
        
    }
}