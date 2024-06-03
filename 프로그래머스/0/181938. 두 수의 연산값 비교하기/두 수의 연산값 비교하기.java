class Solution {
    public int solution(int a, int b) {
        
        int num = Integer.parseInt("" + a + b);
        
        if(num == (2*a*b)){
            return num;
        }
        return Math.max(num, (2 * a * b));
    }
}