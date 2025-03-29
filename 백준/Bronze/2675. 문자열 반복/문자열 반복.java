import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());//2
        String arr[] = new String[n];
        StringBuilder sb = new StringBuilder();
        
        for(int i  = 0; i<n; i++) {
            String strArr[] = br.readLine().split(" ");
            int repeatNum = Integer.parseInt(strArr[0]) * strArr[1].length();
            int count = 0;
            for(int j = 1; j <= repeatNum; j++) {
                sb.append(strArr[1].charAt(count));
                if(j % Integer.parseInt(strArr[0]) == 0){
                    count++;
                }
            }
            arr[i] = sb.toString();
            sb = new StringBuilder();
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]); 
        }
    }
}