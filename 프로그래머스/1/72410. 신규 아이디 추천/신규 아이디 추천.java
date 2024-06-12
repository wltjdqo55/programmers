class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();  //1단계
        for(int i=0;i<new_id.length();i++){  //2단계
            char c = new_id.charAt(i);
            if(c>='a'&&c<='z' || c>='0' && c<= '9' || c=='-' || c=='_' || c=='.') answer += String.valueOf(c);
        }
        new_id = answer;
        answer = "";
        for(int i=0;i<new_id.length();i++){  // 3단계
            char c = new_id.charAt(i);
            if(answer.equals("")) answer += String.valueOf(c);
            else if(c == '.' && answer.charAt(answer.length()-1)=='.') continue;
            else answer += String.valueOf(c);
        }
        
        if(answer.charAt(0) == '.') answer = answer.substring(1); // 4단계
        
        new_id = answer;
        if(new_id.equals("")) new_id = "a"; // 5단계
        else if(new_id.length()>=16) new_id = new_id.substring(0,15);   // 6단계
        
        if(new_id.charAt(new_id.length()-1) == '.') new_id = new_id.substring(0, new_id.length()-1);    // 6단계
        
        if(new_id.length()<=2) {
            while(new_id.length()!=3){
                new_id += String.valueOf(new_id.charAt(new_id.length()-1));
            }
        }
        
        System.out.println(new_id);
        
        return new_id;
    }
}