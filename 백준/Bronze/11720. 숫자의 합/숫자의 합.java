import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        
        sc.close();
        
        for(int i = 0 ; i < n; i++) {
           sum +=  str.charAt(i) - '0';
        }
          System.out.println(sum);
    }
    
}