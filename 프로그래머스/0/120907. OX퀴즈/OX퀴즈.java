class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            String[] sArr = quiz[i].split(" ");
            
            int x = Integer.parseInt(sArr[0]);
            int y = Integer.parseInt(sArr[2]);
            int z = Integer.parseInt(sArr[4]);
            
            for(int j=0;j<sArr.length;j++){
                switch (sArr[j]) {
                    case "-" :
                        if((x-y) == z) answer[i] = "O";
                        else answer[i] = "X";
                        break;    
                    
                    case "+" :
                        if((x+y) == z) answer[i] = "O";
                        else answer[i] = "X";
                        
                    default :
                        break;
                }
            }
            
            
        }
        
        
        
        
        return answer;
    }
}