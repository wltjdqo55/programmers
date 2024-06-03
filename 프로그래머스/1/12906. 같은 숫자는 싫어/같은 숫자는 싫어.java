import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
            if(i==arr.length-2){
                list.add(arr[i+1]);
                break;
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}