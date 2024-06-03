class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0;i<my_string.length();i++){
            char ch = my_string.charAt(i);
            if(ch>='A' && ch<='Z'){
                answer += String.valueOf(ch).toLowerCase();
            }
            else{
                answer += String.valueOf(ch).toUpperCase();
            }
            
        }
        
        
        
        return answer;
    }
}