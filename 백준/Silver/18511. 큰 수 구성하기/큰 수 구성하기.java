import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
public class Main {
  static int n, max = 0;
  static Integer[] kArr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    // N과 K 입력받기
    n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    // K 집합의 원소들 입력받기
    kArr = new Integer[k];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < k; i++) {
      kArr[i] = Integer.parseInt(st.nextToken());
    }

    // K 배열 내림차순 정렬
    Arrays.sort(kArr, Collections.reverseOrder());
    
    // DFS 탐색을 통해 최댓값 찾기
    findMax(0);
    System.out.println(max);
  }

  // DFS를 이용한 가능한 숫자 조합 탐색
  private static void findMax(int current) {
    // 현재 숫자가 N을 초과하면 종료
    if (current > n) {
      return;
    }

    // 현재 값이 N 이하인 경우 최댓값 갱신
    max = Math.max(max, current);

    // 각 자리수에 kArr의 값을 추가하여 가능한 모든 조합 탐색
    for (int i = 0; i < kArr.length; i++) {
      findMax(current * 10 + kArr[i]);
    }
  }
}