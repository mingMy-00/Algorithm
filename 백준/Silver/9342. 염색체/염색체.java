import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Pattern pattern = Pattern.compile("^[A-F]?A+F+C+[A-F]?$");

        for (int t = 0; t < T; t++) {
            String str = br.readLine();
            Matcher matcher = pattern.matcher(str);

            if (matcher.matches()) {
                System.out.println("Infected!");
            } else {
                System.out.println("Good");
            }
        }
    }
}
