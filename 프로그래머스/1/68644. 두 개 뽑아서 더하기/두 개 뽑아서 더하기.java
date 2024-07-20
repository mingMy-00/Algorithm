import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
    
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length ; j++) {
                if( i == j)
                    continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        //int index = 0;
        //int[] arr = new int[set.size()];
        //for(int v : set) {
        //    arr[index++] = v;
        //}
        
        return set.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
        //return arr;
    }
}