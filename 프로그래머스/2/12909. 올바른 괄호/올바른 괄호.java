import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int count = 0;
        char[] charArr = s.toCharArray();
        
        
            for(int i=0;i<charArr.length;i++){
                if(charArr[i] == '('){
                    count++;
                }
                else{
                    if(count==0){
                        return false;
                    }
                    else{
                        count--;
                    }
                }
            }
        
        
        return count==0 ? true : false;
    }
}