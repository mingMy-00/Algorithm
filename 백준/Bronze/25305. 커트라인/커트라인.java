import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strArr[] = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]); //5
        int k = Integer.parseInt(strArr[1]); //2
        
        String scoreArr[] = br.readLine().split(" ");
        int scoreIntArr[] = new int[N];
        
        for(int i= 0; i < N; i++) {
            scoreIntArr[i] = Integer.parseInt(scoreArr[i]);
        }
        
        Arrays.sort(scoreIntArr);
         
        System.out.println(scoreIntArr[N-k]);
    }
}