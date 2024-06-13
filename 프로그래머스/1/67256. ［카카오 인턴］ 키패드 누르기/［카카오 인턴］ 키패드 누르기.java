class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
       
        for(int i=0;i<numbers.length;i++){
            int n = numbers[i];
            if(n == 1 || n == 4 || n == 7){
                answer += "L";
                left = n;
            }
            else if(n == 3 || n == 6 || n == 9){
                answer += "R";
                right = n;
            }
            else{
                if(n == 0) n = 11;
                int l = (Math.abs(n-left) /3) + (Math.abs(n-left) % 3) ;
                int r = (Math.abs(n-right) /3) + (Math.abs(n-right) % 3) ;
                
                if(l==r) {
                    if (hand.equals("right")) {
                        right = n;
                        answer += "R";
                    }else{
                        left = n;
                        answer += "L";
                    }
                }
                else if(l>r) {
                    answer += "R";
                    right = n;
                }
                else if(l<r){
                    answer += "L";
                    left = n;
                } 
            }
            
        }
        
        return answer;
    }
}