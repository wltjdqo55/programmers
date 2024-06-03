import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return new int[]{a, n*m/a};
    }
}
