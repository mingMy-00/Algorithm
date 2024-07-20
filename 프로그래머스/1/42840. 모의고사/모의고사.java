import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        //생각하는 자료구조 종류 : 완전탐색 => 하나하나 다 비교해야함. 
        //1. 수포자들의 정답 패턴을 저장하기
        int[][] pattern = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        
        //2. 정답 횟수 담아줄 count[]배열
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        
        //3. 정답배열인 answer과 비교하기 
        for(int i = 0; i < answers.length ; i++) {
            //정답이 5개라서 5번 반복 
            for(int j = 0; j < pattern.length ; j++) {
                //3명이라서 3번 반복 
                if(answers[i] == pattern[j][i % pattern[j].length] )
                //count[j]++;
                map.put(j+1, map.get(j+1)+1);
               
            }
        }
        
        //4. 가장 높은 점수 구하기 
        int maxValue = 0;
        for (int i = 1; i <= map.size(); i++) {
            if(map.get(i) > maxValue) {
                maxValue = map.get(i);
            }
        }

        //5. 가장 높은 점수와 일치하는 사람의 키값 추가
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < map.size(); i++) {
            if(map.get(i+1) == maxValue) {
                arr.add(i+1);
            }
        }

        //6. 배열 값으로 넘기기
        int[] answer = arr
            .stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        
        return answer;
    }
}