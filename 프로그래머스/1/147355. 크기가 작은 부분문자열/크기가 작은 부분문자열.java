class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0;i<t.length()-p.length()+1;i++){
            
            long num = Long.parseLong(p);
            long diff = Long.parseLong(t.substring(i, i+p.length()));
            
            if(diff <= num){
                answer++;
            }
        }
        
        
        
        return answer;
    }
}