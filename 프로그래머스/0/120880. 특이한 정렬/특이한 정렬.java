import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // numlist를 리스트로 변환
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            list.add(num);
        }

    
        
        // 커스텀 정렬: n과의 차이로 정렬
        list.sort((a, b) -> {
            int diff1 = Math.abs(a - n);
            int diff2 = Math.abs(b - n);
            // 차이가 같으면 더 큰 숫자가 앞에 오도록 정렬
            if (diff1 == diff2) {
                return b - a;
            } else {
                return diff1 - diff2;
            }
        });

        // 정렬된 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}