import java.io.*;
import java.util.StringTokenizer;
public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] arr = br.readLine().split(" ");
			int[] basket = new int[Integer.parseInt(arr[0])];
			int M = Integer.parseInt(arr[1]);
			int i = 0;
			int j = 0;
			int k = 0;

			
			for(int a = 0; a < M; a++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				 i = Integer.parseInt(st.nextToken());
				 j = Integer.parseInt(st.nextToken());
				 k = Integer.parseInt(st.nextToken());

				for(int b = i-1; b <= j-1; b++){
					  basket[b] = k;
					}
				}
			

			for(int o = 0; o < basket.length; o++) {
				System.out.print(basket[o] + " ");
			}
		}
}