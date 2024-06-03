import java.util.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.println(i + " " + j + " ");
                hashSet.add(numbers[i]+numbers[j]);
            }
        }
        List<Integer> tempSet = new ArrayList<>(hashSet);
        Collections.sort(tempSet);
        
        return tempSet.stream().mapToInt(i->i).toArray();
    }
}