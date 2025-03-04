import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <N; i++) {
            int n = Integer.parseInt(arr[i]);
            if(n < min) {
                min = n;
            }
            if(n > max) {
                max = n;
            }
        }
        
        System.out.println(min + " " + max);
    }
}