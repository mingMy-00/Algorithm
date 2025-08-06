import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        
        // 별표 기준으로 prefix, suffix 나누기
        String[] parts = pattern.split("\\*");
        String prefix = parts[0];
        String suffix = parts[1];
        
        for (int i = 0; i < N; i++) {
            String filename = br.readLine();

            // 파일 길이가 패턴보다 짧은 경우 제외
            if (filename.length() < prefix.length() + suffix.length()) {
                System.out.println("NE");
                continue;
            }

            boolean startsWith = filename.startsWith(prefix);
            boolean endsWith = filename.endsWith(suffix);
            
            if (startsWith && endsWith) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
