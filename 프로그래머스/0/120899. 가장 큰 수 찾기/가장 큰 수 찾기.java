import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int index = 0;
        int temp = array[0];
        for(int i=0;i<array.length;i++){
            if(temp<array[i]){
                temp = array[i];
                index = i;
            }
        }
        answer[0] = temp;
        answer[1] = index;
        return answer;
    }
}