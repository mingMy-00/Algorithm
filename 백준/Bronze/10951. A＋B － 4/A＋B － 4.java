import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[2];
        int num1 = 0;
        int num2 = 0;
        String line;
        while((line = br.readLine()) != null) {
            arr = line.split(" ");

            num1 = Integer.parseInt(arr[0]);
            num2 = Integer.parseInt(arr[1]);
        
            System.out.println(num1 + num2);
        }
        
    }
}