import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0;i<players.length;i++){
            map.put(players[i], i+1);
        }
    
        
        for(int i=0;i<callings.length;i++){
            int winidx=map.get(callings[i]);
            String winner = players[winidx-1];
            String loser = players[winidx-2];
            players[winidx-1]=loser;
            players[winidx-2]=winner;

            map.put(winner,winidx-1);
            map.put(loser,winidx);
            
        }
        answer = players;
        return answer;
    }
}