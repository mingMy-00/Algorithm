import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int[] intArr = new int[2];
        
        for(int i =0; i < 2; i++) {
             String s = "";
             for(int j =2; j >= 0; j--) {
                  s += strArr[i].charAt(j);
             }
             intArr[i] = Integer.parseInt(s);
        }
        System.out.println(Math.max(intArr[0] , intArr[1]));
    }
}