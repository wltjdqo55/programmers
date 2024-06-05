import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        ArrayList<String> list = new ArrayList();
        for(int i=0;i<my_string.length();i++){
            list.add(String.valueOf(my_string.charAt(i)));
        }
        
        String answer = "";
        for(int i=0;i<indices.length;i++){
            list.set(indices[i], "_");
        }
        for(String s : list){
            answer += s;
        }
       
        answer = answer.replaceAll("_", "");
        
        return answer;
    }
    
   
}