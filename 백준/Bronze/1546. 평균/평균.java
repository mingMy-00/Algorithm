import java.io.*;
	import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			double avarage = 0;
			double[] arr = new double[N];
			double maxScore = Double.MIN_VALUE;

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
				if (maxScore < arr[i]) {
					maxScore = arr[i];
				}
			}

			for (int i = 0; i < arr.length; i++) {
				avarage += (arr[i] / maxScore * 100);
			}

			System.out.println(avarage / N);
		}
	}