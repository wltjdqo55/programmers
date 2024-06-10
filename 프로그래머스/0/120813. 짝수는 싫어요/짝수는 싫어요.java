import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(i % 2 == 1) list.add(i);
        }
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}