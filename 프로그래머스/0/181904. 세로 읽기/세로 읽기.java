class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] sArr = new String[my_string.length()/m];
        
        int idx = 0;
        for(int i=0;i<sArr.length;i++){
            sArr[i] = my_string.substring(idx, idx+m);
            idx+=m;
        }
        for(int i=0;i<sArr.length;i++){
            String str = String.valueOf(sArr[i].charAt(c-1));
            answer += str;
        }
        
        return answer;
    }
}