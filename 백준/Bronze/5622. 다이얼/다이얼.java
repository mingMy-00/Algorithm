import java.io.*;
public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			int count = 0;

			for(char c : s.toCharArray()) {
				if(c >= 'A' && c <=  'C') {
					count += 3;
				}else if(c >= 'D' && c <= 'F') {
					count += 4;
				}else if(c >= 'G' && c <= 'I') {
					count += 5;
				}else if(c >= 'J' && c <= 'L') {
					count += 6;
				}else if(c >= 'M' && c <= 'O') {
					count += 7;
				} else if (c >= 'P' && c <= 'S') {
					count += 8;
				} else if (c >= 'T' && c <= 'V') {
					count += 9;
				} else if(c >= 'W' && c <= 'Z'){
					count += 10;
				}
		    }
            
            System.out.println(count);
	}
}