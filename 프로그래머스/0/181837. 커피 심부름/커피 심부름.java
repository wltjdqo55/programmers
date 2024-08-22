class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String o : order){
            if(o.indexOf("americano") != -1 || o.equals("anything")){
                answer += 4500;
            }else{
                answer += 5000;
            }
        }
        
        return answer;
    }
}