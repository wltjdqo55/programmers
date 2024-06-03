import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] chArr = s.toCharArray();
        if(s.length()==4 || s.length()==6){
            for(char c : chArr){
                if(!('0' <= c && c <= '9')){
                    answer = false;
                    break;
                }
            }
        }
        else{
            answer = false;
        }
        return answer;
    }
}