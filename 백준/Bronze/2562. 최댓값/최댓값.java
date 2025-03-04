import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        
        for(int i =1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > max) {
                max = num;
                maxCount = i;
            }
        }
        
        System.out.println(max);
        System.out.println(maxCount);
    }
}