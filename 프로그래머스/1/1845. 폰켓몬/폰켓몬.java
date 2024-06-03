import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        int[] numArr = Arrays.stream(nums).distinct().toArray();
        
        if(numArr.length <= nums.length / 2){
            answer += numArr.length;
        }
        else{
            answer += nums.length / 2;
        }
        return answer;
    }
}