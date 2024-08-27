class Solution {
    public int[] solution(String s) {
        
        int count = 0;
        int sum = 0;
        
        while(!s.equals("1")){
            String str = s.replaceAll("0", "");
            sum += (s.length()-str.length());
            
            int num = str.length();
            
            s = Integer.toBinaryString(num);
            count++;
        }
        
        int[] answer = new int[2];
        answer[0] = count;
        answer[1] = sum;
        
        return answer;
    }
}