import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스 수 입력
        sc.nextLine(); // 개행문자 처리
        
        for (int i = 0; i < T; i++) {
            String input = sc.nextLine(); // 문자열 입력
            int[] freq = new int[26]; // 알파벳 빈도수 저장 배열
            
            // 입력 문자열에서 알파벳의 빈도수를 카운트
            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    freq[c - 'a']++;
                }
            }
            
            // 가장 빈번한 알파벳을 찾는다
            int maxFreq = 0;
            char result = '?';
            boolean duplicate = false;
            
            for (int j = 0; j < 26; j++) {
                if (freq[j] > maxFreq) {
                    maxFreq = freq[j];
                    result = (char) (j + 'a');
                    duplicate = false; // 새로운 최댓값을 찾으면 중복이 아님
                } else if (freq[j] == maxFreq && freq[j] != 0) {
                    duplicate = true; // 같은 빈도수의 다른 문자가 있으면 중복
                }
            }
            
            // 중복이 있으면 '?'를 출력, 아니면 가장 빈번한 문자 출력
            if (duplicate) {
                System.out.println("?");
            } else {
                System.out.println(result);
            }
        }
        
        sc.close();
    }
}
