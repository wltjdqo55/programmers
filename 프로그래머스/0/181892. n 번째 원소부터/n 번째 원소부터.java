class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        
        int j=0;
        for(int i=n;i<=num_list.length;i++,j++){
            answer[j]=num_list[i-1];
        }
        
        
        
        return answer;
    }
}