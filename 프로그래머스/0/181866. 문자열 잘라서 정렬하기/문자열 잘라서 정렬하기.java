import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // "x"를 기준으로 문자열을 나누기
        String[] splitStrings = myString.split("x");
        
        // 빈 문자열을 제거하기 위해 리스트로 변환
        List<String> filteredList = new ArrayList<>();
        for (String str : splitStrings) {
            if (!str.isEmpty()) {
                filteredList.add(str);
            }
        }
        
        // 리스트를 사전순으로 정렬
        Collections.sort(filteredList);
        
        // 다시 배열로 변환하여 반환
        return filteredList.toArray(new String[0]);
    }
}