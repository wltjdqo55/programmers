class Solution {
    public int solution(long num) {
        long answer = 0;
        
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num = (num*3+1);
            }
            
            answer++;
            if(answer == 500){
                return -1;   
            }
        }
        
        
        return (int)answer;
    }
}