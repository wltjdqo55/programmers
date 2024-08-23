import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        String[] answer = my_string.split(" ");
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0;i<answer.length;i++){
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        
        String[] strArr = new String[list.size()];
        
        for(int i=0;i<strArr.length;i++){
            strArr[i] = list.get(i);
        }
        
        return strArr;
    }
}