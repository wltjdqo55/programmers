import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int length = s.length();
        
        for(int i = 0 ; i < length ; i ++) {
            String word = s.substring(i) + s.substring(0, i);;
            
            if(this.checkWord(word)){
               answer++;  
            } 
        }
        return answer;
    }
    
    private boolean checkWord(String word) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : word.toCharArray()) {
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if(c == ')' || c == ']' || c == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                char last = stack.pop();
                if(!this.isMatchingPair(last, c)){
                    return false;
                }
            }
        }
             
        return stack.isEmpty();
    }
    
    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}