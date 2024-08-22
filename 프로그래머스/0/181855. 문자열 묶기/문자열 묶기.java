import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<strArr.length;i++){
            
            int length = strArr[i].length();
                
            if(map.containsKey(length)){
                map.put(length, map.get(length) + 1);
            }
            else{
                map.put(length, 1);
            }
        }
        for(int count : map.values()){
            if(count > answer){
                answer = count;
            }
        }
        
        return answer;
    }
}