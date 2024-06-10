class Solution {
    public int solution(int hp) {
        int answer = 0;
       
        answer = hp / 5;
        int r = hp % 5;
        answer += r / 3;
        int k = r % 3;
        answer += k / 1;
       
        return answer;
    }
}