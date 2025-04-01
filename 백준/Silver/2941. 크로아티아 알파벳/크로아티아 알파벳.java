import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 크로아티아 알파벳 배열
        String croati[] = new String[8];
        croati[0] = "c=";
        croati[1] = "c-";
        croati[2] = "dz=";
        croati[3] = "d-";
        croati[4] = "lj";
        croati[5] = "nj";
        croati[6] = "s=";
        croati[7] = "z=";

        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 크로아티아 알파벳을 처리할 카운트
        int count = 0;

        // 문자열에서 크로아티아 알파벳을 하나씩 찾아서 카운트
        for (int i = 0; i < croati.length; i++) {
            // 크로아티아 알파벳을 모두 찾아서 카운트
            while (str.contains(croati[i])) {
                str = str.replaceFirst(croati[i], " ");  // 크로아티아 알파벳을 공백으로 교체
                count++;  // 하나의 크로아티아 알파벳을 카운트
            }
        }

        // 남은 문자들의 개수는 하나씩 카운트
        // 공백을 제외하고 남은 문자를 하나씩 카운트
        count += str.replace(" ", "").length();

        // 결과 출력
        System.out.println(count);
    }
}
