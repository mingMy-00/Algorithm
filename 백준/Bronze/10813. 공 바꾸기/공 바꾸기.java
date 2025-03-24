import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String BasketArr[] = br.readLine().split(" ");
        int N = Integer.parseInt(BasketArr[0]);
        int M = Integer.parseInt(BasketArr[1]);
        
        int basket[] = new int[N];
        for(int a = 1; a <= N; a++) {
            basket[a-1] = a;
        }
       
        for(int k = 0; k < M; k ++) {
            BasketArr = br.readLine().split(" ");
            int idx1 = Integer.parseInt(BasketArr[0]) - 1;
            int idx2 = Integer.parseInt(BasketArr[1]) - 1;
            int temp = basket[idx1];
            basket[idx1] = basket[idx2];
            basket[idx2] = temp;
        }
      
        StringBuilder sb = new StringBuilder();
        for(int arr : basket) {
            sb.append(arr + " ");
        }
        
        System.out.println(sb.toString().trim());
    }
}