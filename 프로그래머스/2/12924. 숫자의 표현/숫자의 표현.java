class Solution {
    public int solution(int n) {
        
        int count = 0;
        int sum = 0;
        
        int num = n;
        
        if(n%2==0){
            num = n / 2;
        }
        else{
            num = n / 2 + 1;
        }
        
        count++;
        for(int i=1;i<=num;i++){
            
            sum = i;
            for(int j=i+1;j<=num;j++){
                sum += j;
                if(sum == n){
                    count++;
                    break;
                }
                else if(sum > n) break;
            }
            sum = 0;
        }
        
        return count;
    }
}