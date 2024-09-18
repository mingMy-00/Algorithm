import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: 피연산자의 개수 N
        int N = Integer.parseInt(br.readLine());
        
        // 두 번째 줄: 후위 표기식
        String expression = br.readLine();
        
        // 세 번째 줄부터 N개의 피연산자에 대응하는 값
        double[] values = new double[N];
        for (int i = 0; i < N; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }

        // 스택을 사용하여 후위 표기식 처리
        Deque<Double> stack = new ArrayDeque<>();

        // 후위 표기식 순회
        for (char c : expression.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // 피연산자(A~Z)인 경우: 대응하는 값을 스택에 푸시
                stack.push(values[c - 'A']);
            } else {
                // 연산자인 경우: 스택에서 두 값을 꺼내서 연산 후 푸시
                double b = stack.pop();
                double a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        // 결과 출력 (소수점 둘째 자리까지)
        System.out.printf("%.2f", stack.pop());
    }
}
