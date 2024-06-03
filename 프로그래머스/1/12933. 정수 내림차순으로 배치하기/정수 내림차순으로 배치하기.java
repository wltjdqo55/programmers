import java.util.Arrays;
import java.util.*;

class Solution {
    public long solution(long n) {
        
        
        String s = String.valueOf(n);
       
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder(new String(ch));
        String answer = sb.reverse().toString();
        
        
        return Long.valueOf(answer);
    }
}