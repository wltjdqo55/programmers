class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        if(A.equals(B)) return 0;
        
        for(int i=1;i<=A.length();i++){
            String after = A.substring(A.length()-i);
            String before = A.substring(0, A.length()-i);
            String str = after+before;
            if(str.equals(B)){
                System.out.println(after + before);
                answer = i;
                break;
            }
            
        }
        
        
        return answer;
    }
}