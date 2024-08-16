class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        return myString.indexOf(pat) == -1 ? 0 : 1;
    }
}