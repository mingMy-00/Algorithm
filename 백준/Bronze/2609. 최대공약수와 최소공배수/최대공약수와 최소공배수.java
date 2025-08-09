import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		//한 줄로 숫자 두 개를 받아옴
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//한 줄에 공백 기준으로 들어있는 숫자 두 개를 분리함.
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		//최대 공약수 구하기
		int max = gcd(num1, num2);
		int min = ((num1*num2)/max);

		System.out.println(max);
		System.out.println(min);

		br.close();
	}

	private static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}

		return gcd(num2, num1 % num2);
	}
    
}