import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int H = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(br.readLine());
        M = M + T;
            
        if(M >= 60) {
            H = H + (M / 60);
            M = M % 60;
        }
        
        if(H >= 24){
           H = H - 24;
        }
            
        System.out.println(H + " " + M);
        
        }
    }