

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
          arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        HashSet<String> set = new HashSet<>();
        boolean[] visited = new boolean[n];

        addCard(arr, visited, "", 0 , k, set);
        System.out.println(set.size());
    }

    private static void addCard(int[] arr, boolean[] visited, String current, int depth, int k, HashSet<String> set) {
      if(depth == k) {
        set.add(current);
        return;
      }

      for(int i = 0; i < arr.length; i++) {
        if(!visited[i]) {
          visited[i] = true;
          addCard(arr, visited, current + arr[i], depth + 1, k, set);
          visited[i] = false; // Backtrack
        }
      }
    }
}
