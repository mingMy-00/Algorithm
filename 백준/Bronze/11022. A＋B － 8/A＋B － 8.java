import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[2];
        int sum = 0;
        String plusStr = "";
        for(int i =1; i <=T; i++) {
            arr = br.readLine().split(" ");
            sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            plusStr = arr[0] + " + " + arr[1] + " = ";
            System.out.println("Case #" + i + ": " + plusStr + sum);
        }
    }
}