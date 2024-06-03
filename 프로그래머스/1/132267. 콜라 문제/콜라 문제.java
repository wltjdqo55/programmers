class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bottle = 0;             //bottle = 18 , n = 1, r = 0 , count = 1
        int count = 0;
        while(n >= a){
            int r = n / a * b;
            if(n % a == 0){
                n = n / a * b;
            }
            else{
                n = (n / a * b) + n % a;
            }
            bottle += r;
            
        }
        
        
        return bottle;
    }
}