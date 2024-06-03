import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            int in = commands[i][0];
            int jn = commands[i][1];
            int kn = commands[i][2];
            
            ArrayList<Integer> list = new ArrayList();
            for(int j=in-1;j<jn;j++){
                list.add(array[j]);
            }
            
            Collections.sort(list);
            answer[i] = list.get(kn-1);
        }
        
        return answer;
    }
}