class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        for(int i=0;i<num_list.length;i++){
            answer[i] = num_list[i];
        }
        
        int num = num_list.length - 1;
        if(num_list[num]>num_list[num-1]){
            answer[answer.length-1] = num_list[num] - num_list[num-1];
        }
        else{
            answer[answer.length-1] = num_list[num]*2;
        }
        return answer;
    }
}