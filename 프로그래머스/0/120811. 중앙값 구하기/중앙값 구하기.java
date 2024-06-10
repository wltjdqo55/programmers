import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        
        for(int o : array){
            System.out.println(o);
        }
        return array[array.length /2];
    }
}