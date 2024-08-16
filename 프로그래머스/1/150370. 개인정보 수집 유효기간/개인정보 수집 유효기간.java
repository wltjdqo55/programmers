import java.util.*;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[1];
        
        ArrayList<Integer> numArr = new ArrayList<>();
        HashMap<String, String> map = new HashMap<String, String>();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        
        for(int i=0;i<terms.length;i++){
            map.put(terms[i].substring(0, 1), terms[i].substring(2));
        }
        
        for(int i=0;i<privacies.length;i++){
            String dateStr = privacies[i].substring(0, 10);
            LocalDate localToday = LocalDate.parse(today, formatter);    //오늘날짜
            LocalDate afterDate = LocalDate.parse(dateStr, formatter).plusMonths(Integer.parseInt(map.get(privacies[i].substring(11))));    // 약관 종료일
            
            if(afterDate.isBefore(localToday)){
                numArr.add(i+1);
            }
            else if (afterDate.isAfter(localToday)) {
                System.out.println("오늘 이후의 날짜");
            } 
            else {
                numArr.add(i+1);
            }
        }
        
        Collections.sort(numArr);
        
        return numArr;
    }
}