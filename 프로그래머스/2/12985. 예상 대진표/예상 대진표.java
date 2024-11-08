import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
    
        int round = 1;
        
        while(n > 1) {
            
            if(Math.abs(a-b)==1 && Math.min(a,b) % 2 == 1){
                return round;
            }
            
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            
            round++;
            n /= 2;
        }

        return round;
    }
}