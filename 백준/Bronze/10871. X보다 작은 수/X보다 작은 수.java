import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
	public class Main{
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();  

			for(int i = 0 ; i < N ; i++) {
                int num = Integer.parseInt(st.nextToken());
                if(num < X) {
                    sb.append(num).append(" ");
                }
			}
            System.out.println(sb.toString().trim());

        }
	}