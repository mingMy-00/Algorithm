import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char cArr[] = br.readLine().toCharArray();
		int num = cArr.length / 2;
		boolean flag = true;

		for(int i  = 0; i < num; i++) {
			if(cArr[i] != cArr[cArr.length - 1 - i]) {
                flag = false;
				break;
			}
		}

		System.out.println((flag) ? 1 : 0);
	}
}