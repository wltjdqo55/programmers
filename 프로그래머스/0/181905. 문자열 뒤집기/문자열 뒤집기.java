class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e+1);
        
        StringBuffer buffer = new StringBuffer(answer);
        String reverAnswer = buffer.reverse().toString();
        
        my_string = my_string.replaceAll(answer, reverAnswer);
        
        
        return my_string;
    }
}