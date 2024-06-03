class Solution {
    public int solution(int n) {
        if(n<=7) return 1;
        
        int k = n / 7;
        int y = n % 7;
        
        if(y==0){
            return k;
        }
        else{
            return k+1;
        }
    }
}