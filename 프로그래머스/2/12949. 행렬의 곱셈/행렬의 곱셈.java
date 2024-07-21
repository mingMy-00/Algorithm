class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    
    //1. 변수명 생성 
    int le1 = arr1.length;    //행의 길이 만큼 반복
    int le2 = arr1[0].length; //행의 내재 수들 반복
    int le3 = arr2.length;    //열의 길이 만큼 안쪽 반복
    int le4 = arr2[0].length; //열의 내재 길이 만큼 곱하기 
        
    //2. 사이즈 할당     
    int[][] answer = new int[le1][le4];

    //3. 곱해주면서 값 더해주기 
    //3_1. 전체 곱의 수는 행의 길이 만큼  (3번)
    for(int i = 0 ; i < le1; i++) { 
    //3_2. 열의 길이 만큼 다시 곱해줌  (3*2)
        for(int j = 0; j < le4; j++) { 
    //3_3. 3*2안에서 2*2가 되어야함 (arr1[0] * arr2[0]) = (le2 * le3)
            for(int a = 0; a < le2; a++) {
              answer[i][j] += arr1[i][a] * arr2[a][j];    
            }
        }
    }
        
        return answer;
    }
}