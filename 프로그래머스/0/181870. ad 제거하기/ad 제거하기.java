import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].indexOf("ad")==-1){
                list.add(strArr[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}