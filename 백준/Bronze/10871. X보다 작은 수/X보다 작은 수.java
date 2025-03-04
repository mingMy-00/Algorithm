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

			String[] arr = br.readLine().split(" ");
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0 ; i < N ; i++) {
				if(Integer.parseInt(arr[i]) < X) {
					list.add(Integer.parseInt(arr[i]));
				}
			}

			for(int i = 0; i < list.size(); i++ ) {
                if(i != list.size() - 1) {
                    System.out.print(list.get(i) + " ");
                }else {
                    System.out.print(list.get(i));
                }
			}
		}
	}