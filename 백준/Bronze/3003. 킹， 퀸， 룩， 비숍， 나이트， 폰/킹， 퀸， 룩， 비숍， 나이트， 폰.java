import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  	String chess[] = br.readLine().split(" ");
			int check[] = {1, 1, 2, 2, 2, 8};
			for(int i = 0; i < chess.length; i++) {
				if(Integer.parseInt(chess[i]) != check[i]) {
					System.out.print(check[i] - Integer.parseInt(chess[i]) + " ");
				}else {
					System.out.print("0 ");
				}
			}
		}
	}