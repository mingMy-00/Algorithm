import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[2];
        
        int a = 0; 
        int b = 0;
        
        for(int i = 0; i < n; i++) {
            arr = (br.readLine().split(" "));
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            
            bw.write(a + b + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
    
       
}