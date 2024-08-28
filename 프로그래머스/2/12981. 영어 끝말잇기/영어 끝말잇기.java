import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        
        HashMap<String, Boolean> map = new HashMap<>();
        
        char lastChar = words[0].charAt(words[0].length() - 1);
        
        for(int i = 0 ; i < words.length ; i ++) {
            String word = words[i];
            int player = (i % n) + 1;
            int turn = (i / n) + 1;
            
            if(map.containsKey(word)) {
                answer[0] = player;
                answer[1] = turn;
                return answer;
            }
            
            if(i > 0 && word.charAt(0) != lastChar) {
                answer[0] = player;
                answer[1] = turn;
                return answer;
            }
            
            map.put(word, true);
            lastChar = word.charAt(word.length() - 1);
        }
       
        return answer;
    }
}