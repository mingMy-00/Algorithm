import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        //1. 도전하는 사람의 수를 구하기 => Challenger는 총 7개의 공간 
        // ㅁ(버림) ㅁ1 ㅁ2 ㅁ3 ㅁ4 ㅁ5 ㅁ6(5를 성공한 사람) 
        int Challenger[] = new int[N+2]; 
        
        //2. 각 스테이지 마다 도전하는 사람의 수 지정 
        for(int i = 0; i < stages.length; i++) {
            //반복을 8번 돔
            Challenger[stages[i]]  += 1;
        }
        
        //3. 전체 도전하는 사람의 수 지정
        double total = stages.length;
        
        //4. 실패율 지정 맵 
        Map<Integer, Double> fails = new HashMap<>();
        
        //5. 실패율 계산
        for(int i = 1; i <= N; i++) {
            //5_1. 실패율 0인 배열 먼저 지정
            if(Challenger[i] == 0)  {
                fails.put(i, 0.);
            }else {
                 fails.put(i , (Challenger[i] / total));
                 total -= Challenger[i];
            }
        }
        
        return fails.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
        
    }
}