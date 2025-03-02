import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int realSum   = Integer.parseInt(br.readLine());
        int n         = Integer.parseInt(br.readLine());
        String[] arr  = new String[2];
        int sum       = 0;
        
        for(int i = 1; i <= n; i++) {
            arr = br.readLine().split(" ");
            sum += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }
        
        System.out.println((realSum == sum) ? "Yes" : "No");
    }
}