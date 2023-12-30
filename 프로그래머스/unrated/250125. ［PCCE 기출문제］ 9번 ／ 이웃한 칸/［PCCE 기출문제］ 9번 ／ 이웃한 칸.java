class Solution {
    public int solution(String[][] board, int h, int w) {
        
        //정수를 저장할 변수 n을 만들고 board의 길이를 저장
        int n = board.length;//4        

        //같은 색으로 색칠된 칸의 개수를저장할 변수 
        int count = 0;
        
        //h와 w의 변화량을 저장
        int[] dh = {0,1,-1,0}; 
        int[] dw = {1,0,0,-1};
        
        for(int i = 0; i <= 3; i++) {
            int h_check = h + dh[i];//2
            int w_check = w + dw[i];//1
            System.out.println("h_check" + h_check);
            System.out.println("w_check" + w_check);
            
            if((h_check >= 0 && h_check < n) && (w_check >= 0 && w_check < n)) {
                
                System.out.println("board[h][w]" + board[h][w]);
                
                System.out.println("board[h_check][w_check]" + board[h_check][w_check]);
                
                if(board[h][w].equals(board[h_check][w_check])) {
                            count++;
                    System.out.println("count" + count);
                }
            }
        }
        return count;
    }
}