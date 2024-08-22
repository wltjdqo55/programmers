class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int width = myString.lastIndexOf(String.valueOf(pat.charAt(pat.length()-1)));
        
        
        answer = myString.substring(0, width+1);
        
        return answer;
    }
}