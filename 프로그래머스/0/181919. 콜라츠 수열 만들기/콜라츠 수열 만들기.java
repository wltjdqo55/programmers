import java.util.Arrays.*;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();        
        for(int i=0;i<=1000;i++){
            
            answer.add(n);
            
            if(n == 1) break;
            
            if(n % 2 == 0){
                n /= 2;
            }
            else if(n % 2 == 1){
                n = (3 * n + 1);
            }
        }
        
        return answer;
    }
}