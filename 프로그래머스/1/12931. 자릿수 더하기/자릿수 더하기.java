import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++){
            String str = String.valueOf(s.charAt(i));
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}