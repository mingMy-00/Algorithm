import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        str1.append(strArr[0]);
        str2.append(strArr[1]);
        
        System.out.println(Math.max(Integer.parseInt(str1.reverse().toString()) , Integer.parseInt(str2.reverse().toString())));
    }
}