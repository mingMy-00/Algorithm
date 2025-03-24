import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String BasketArr[] = br.readLine().split(" ");
        int N = Integer.parseInt(BasketArr[0]);
        int M = Integer.parseInt(BasketArr[1]);
        int num1 = 0;
        int num2 = 0;
        
        int basket[] = new int[N];
        
        for(int a = 1; a <= N; a++) {
            basket[a-1] = a;
        }
       
        for(int k = 0; k < M; k ++) {
            BasketArr = br.readLine().split(" ");
            num1 = basket[Integer.parseInt(BasketArr[0]) - 1];
            num2 = basket[Integer.parseInt(BasketArr[1]) - 1 ];
            basket[Integer.parseInt(BasketArr[0]) - 1] = num2;
            basket[Integer.parseInt(BasketArr[1]) - 1] = num1;
        }
      
        for(int arr : basket) {
            System.out.print(arr + " ");
        }
        
    }
}