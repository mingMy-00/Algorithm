import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().replaceAll("^\\s+", "").split(" ");
        
        if(arr[0].equals("")) {
           System.out.println(0);
        } else {
        System.out.println(arr.length);
        }
    }
}