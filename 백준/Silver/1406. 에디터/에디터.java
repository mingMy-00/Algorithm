import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 초기 편집기 입력 문자열을 받아줌
    String[] str = br.readLine().split("");
    Deque<String> leftDq = new ArrayDeque<>();

    // 왼쪽 덱에 입력 문자열을 순서대로 추가
    for (int i = 0; i < str.length; i++) {
        leftDq.addLast(str[i]);  // addLast로 순서대로 넣음
    }

    // 명령어의 개수 입력받기
    int N = Integer.parseInt(br.readLine());

    // 오른쪽 덱 생성
    Deque<String> rightDq = new ArrayDeque<>();

    // 명령어 수행
    for (int i = 0; i < N; i++) {
        String[] strArr = br.readLine().split(" ");

        switch (strArr[0]) {
            case "L":
                if (!leftDq.isEmpty()) {
                    rightDq.push(leftDq.pollLast());  // 커서를 왼쪽으로 이동 (오른쪽 덱에 넣음)
                }
                break;
            case "D":
                if (!rightDq.isEmpty()) {
                    leftDq.addLast(rightDq.pop());  // 커서를 오른쪽으로 이동 (왼쪽 덱에 다시 넣음)
                }
                break;
            case "B":
                if (!leftDq.isEmpty()) {
                    leftDq.pollLast();  // 왼쪽에서 문자 삭제
                }
                break;
            case "P":
                leftDq.addLast(strArr[1]);  // 커서 위치에 문자 추가
                break;
        }
    }

    // 왼쪽 덱의 내용을 먼저 출력
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (!leftDq.isEmpty()) {
        bw.write(leftDq.pollFirst());  // 왼쪽 덱을 순서대로 출력
    }

    // 오른쪽 덱의 내용을 역순으로 출력 (rightDq는 스택처럼 사용됨)
    while (!rightDq.isEmpty()) {
        bw.write(rightDq.pop());  // 오른쪽 덱을 뒤에서부터 출력
    }

    bw.flush();
    bw.close();
}

    
  
}