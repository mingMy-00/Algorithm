import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i] , i);
        }

         for(String calling : callings) {
             int score = map.get(calling);
             String prePlayer = players[score - 1];
             players[score - 1] = calling;
             players[score] = prePlayer;
             map.put(calling , score - 1);
             map.put(prePlayer,score);
         }
        
        return players;
    }
}