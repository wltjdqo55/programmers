class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int m = 0;
        int answer = 0;
        for(int i=0;i<num_list.length;i++){
            sum += num_list[i];
            
            if(m == 0){
                m = num_list[i];
            }
            else {
                m *= num_list[i];
            }
        }
        if(m < (sum*sum)){
            answer = 1;
        }
        return answer;
    }
}