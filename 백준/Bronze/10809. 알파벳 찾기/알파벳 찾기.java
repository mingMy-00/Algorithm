import java.io.*;
public class Main {
			public static void main(String[] args) throws IOException {
			char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			StringBuilder sb = new StringBuilder();

			for(char c : alphabet) {
					sb.append(s.indexOf(c) + " ");
			}

			System.out.println(sb.toString());
		}
}