import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        
        int max_num = arr[arr.length-1];
        
        for(int i = max_num ; i < 99999999 ; i += max_num) {
            boolean flag = true;
            for(int j = 0 ; j < arr.length - 1 ; j++){
                if(i % arr[j] == 0) continue;
                else flag = false;
            }
            
            if(flag){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
}