import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 중복 신고를 제거하기 위한 HashSet 사용
        HashSet<String> set = new HashSet<>(Arrays.asList(report));
        HashMap<String, List<String>> map = new HashMap<>();
        
        // 중복된 report를 제거 후 map에 신고 정보를 저장
        for (String data : set) {
            String[] stArr = data.split(" ");
            String reporter = stArr[0];
            String reported = stArr[1];
            
            // 신고당한 사람(reported)을 key로, 신고한 사람(reporter) 리스트를 value로 저장
            if (!map.containsKey(reported)) {
                map.put(reported, new ArrayList<String>());
            }
            map.get(reported).add(reporter);
        }
        
        // 신고당한 사람이 k번 이상 신고당한 경우, 신고자에게 알림 횟수 추가
        for (String reported : map.keySet()) {
            List<String> reporters = map.get(reported);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    int index = Arrays.asList(id_list).indexOf(reporter);
                    answer[index]++;
                }
            }
        }
        
        return answer;
    }
}