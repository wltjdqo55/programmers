import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0;i<photo.length;i++){
            int sum = 0;
            for(int j=0;j<photo[i].length;j++){
                String userName = photo[i][j];
                int index = Arrays.asList(name).indexOf(userName);
                if(index != -1){
                    sum += yearning[index];
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}