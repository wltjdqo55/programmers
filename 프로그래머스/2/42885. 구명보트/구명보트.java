import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        int answer = 0;
        int min = 0;
        
        Arrays.sort(people);
        
        if(people[0]+people[1] > limit) return people.length;
        else{
            for(int max=people.length-1;min<=max;max--){
                if(people[min] + people[max] <= limit) min++;
                answer++;
            }
        }
        return answer;
    }
}