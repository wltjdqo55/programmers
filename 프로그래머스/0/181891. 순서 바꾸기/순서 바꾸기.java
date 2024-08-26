class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        // 첫 번째 루프: n부터 끝까지 복사 (num_list의 뒤쪽 부분)
        for(int i=n; i<num_list.length; i++){
            answer[i-n] = num_list[i];
        }
        
        // 두 번째 루프: 0부터 n-1까지 복사 (num_list의 앞쪽 부분)
        for(int i=0; i<n; i++){
            answer[num_list.length - n + i] = num_list[i];
        }
         
        
        
        return answer;
    }
}