class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String ab = "";
        
        for(int i=0;i<myString.length();i++){
            char ch = myString.charAt(i);
            if(ch == 'A') ab += "B";
            else ab += "A";
        }    
        
        return ab.indexOf(pat) == -1 ? 0 : 1;
    }
}