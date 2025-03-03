import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[2];
        int num1 = 0;
        int num2 = 0;
        
        while(true) {
            arr = br.readLine().split(" ");
            num1 = Integer.parseInt(arr[0]);
            num2 = Integer.parseInt(arr[1]);
         
            if(num1 == 0 && num2 == 0 ) {
                break;
            }
            System.out.println(num1 + num2);
        }
        
    }
}