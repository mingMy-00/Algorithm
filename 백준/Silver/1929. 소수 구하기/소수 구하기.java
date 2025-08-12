import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
public class Main {
    static Boolean isPrime[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		isPrime(N);

		for(int i = M; i <= N; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
	}

	private static void isPrime(int N) {
		isPrime = new Boolean[N+1];
        
		for(int i = 0; i <= N; i++ ) {
			isPrime[i] = true;
		}

        isPrime[0] = isPrime[1] = false;
		for(int i = 2; i <= Math.sqrt(N); i++ ) {
			if(isPrime[i]){
				for(int j = i*i; j <= N; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
}