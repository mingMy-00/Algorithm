import java.io.*;
public class Main {
		public static void main(String[] args) throws IOException {
			//1 -> 2초
			//2 -> 3초 abc
			//... 9까지
			//일단 전화기를 구현하고
			//변수 설정
			int count = 0;
			//1. 일반 리스트 배열을 10개 만들고 그 안에 2번방 부터 abc, def, ghi, jkl, mno, pqrs, tuv, wxyz를 넣는다.
			String phoneDial[] = new String[10];
			//2. 1번방에는 아무것도 안 넣어도 됨.
			phoneDial[0] = "";
			phoneDial[1] = "";
			phoneDial[2] = "ABC";
			phoneDial[3] = "DEF";
			phoneDial[4] = "GHI";
			phoneDial[5] = "JKL";
			phoneDial[6] = "MNO";
			phoneDial[7] = "PQRS";
			phoneDial[8] = "TUV";
			phoneDial[9] = "WXYZ";

			//3. 그리고 입력받은 문자열을 charAt 해서 그 값을 기반으로 List 방 안에 있는 문자열 중 charAt으로 일치하는 값이 있는지 봄.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			for(int i = 0; i < s.length(); i++) {
				for(int j = 0; j < phoneDial.length; j++) {
					if(phoneDial[j].contains(String.valueOf(s.charAt(i)))) {
						count += j + 1;
					}
				}
			}
			//4. 일치하면 해당 방 값 + 1의 시간을 더해준다.
			//입력받아 해결
			System.out.println(count);


		}
	}