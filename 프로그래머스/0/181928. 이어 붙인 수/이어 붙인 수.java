class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String hh = "";
        String qq = "";
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i] % 2 == 1){
                hh += String.valueOf(num_list[i]); // 홀수
            }
            else{
                qq += String.valueOf(num_list[i]); // 짝수
            }
        }
        return Integer.parseInt(hh) + Integer.parseInt(qq);
    }
}