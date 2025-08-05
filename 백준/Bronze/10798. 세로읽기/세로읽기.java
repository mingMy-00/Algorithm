import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] charArr = new char[5][];
        int maxLength = 0;
        for(int i = 0; i < 5; i++) {
            charArr[i] = br.readLine().toCharArray();
            if(charArr[i].length > maxLength) {
                maxLength = charArr[i].length;
            }
        }
        
        for(int i = 0; i < maxLength; i++) {
            for(int j = 0; j < 5; j++) {
                if(i < charArr[j].length) {
                    System.out.print(charArr[j][i]);
                }
            }
        }
    }
}