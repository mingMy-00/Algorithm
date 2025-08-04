import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][];
        
        int maxLen = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine().toCharArray();
            if(arr[i].length > maxLen) maxLen = arr[i].length;
        }
        
        for(int j = 0; j < maxLen; j++) {
            for(int i = 0; i < 5; i++) {
                if(j < arr[i].length) {
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}
