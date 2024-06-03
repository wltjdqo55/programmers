class Solution {
    public String solution(String s) {
        String answer = "";
        int n = 1;
        for(int i=0;i<s.length();i++){
            String str = String.valueOf(s.charAt(i));
            if(str.equals(" ")){
                answer += " ";
                n = i;
            }
            else if(n%2==1){
                if(i%2==0){
                    answer += str.toUpperCase();
                }
                else{
                    answer += str.toLowerCase();
                }
            }
            else{
                if(i%2==1){
                    answer += str.toUpperCase();
                }
                else{
                    answer += str.toLowerCase();
                }
            }
        }
        return answer;
    }
}