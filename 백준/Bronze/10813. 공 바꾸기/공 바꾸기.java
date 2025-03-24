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
            int num1 = Integer.parseInt(BasketArr[0]) - 1;
            int num2 = Integer.parseInt(BasketArr[1]) - 1;
            int temp = basket[num1];
            basket[num1] = basket[num2];
            basket[num2] = temp;
        }
      
        for(int arr : basket) {
            System.out.print(arr + " ");
        }
        
    }
}