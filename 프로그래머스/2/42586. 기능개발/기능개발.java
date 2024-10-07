import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        
        int n = 100 - progresses[0];
        int day = n % speeds[0] == 0 ? n / speeds[0] : n / speeds[0] + 1;
        int count = 1;
        
        for(int i = 1 ; i < progresses.length ; i++) {
            if((speeds[i] * day + progresses[i]) >= 100){
                count++;
            }
            else{
                list.add(count);
                n = 100 - (speeds[i] * day + progresses[i]);
                day += n % speeds[i] == 0 ? n / speeds[i] : n / speeds[i] + 1;
                count = 1;
            }
        }
        list.add(count);
        
        System.out.println(list);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}