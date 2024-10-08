import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        if (discount.length < 10) {
            return 0;
        }

        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        
        // 원하는 품목과 수량을 매핑
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 할인 목록을 10일씩 슬라이딩하여 검사
        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> disMap = new HashMap<>();
            
            // 현재 슬라이스(10일)의 할인 품목 수 세기
            for (int j = i; j < i + 10; j++) {
                disMap.put(discount[j], disMap.getOrDefault(discount[j], 0) + 1);
            }

            // 모든 원하는 품목이 할인 목록에 충분히 있는지 체크
            boolean isValid = true;
            for (String key : wantMap.keySet()) {
                if (disMap.getOrDefault(key, 0) < wantMap.get(key)) {
                    isValid = false;
                    break;
                }
            }

            // 유효한 경우 카운트 증가
            if (isValid) {
                answer++;
            }
        }
        
        return answer;
    }
}