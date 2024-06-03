import java.util.ArrayList;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return list.size()!=0 ? answer : new int[]{-1};
    }
}