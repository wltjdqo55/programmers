import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> validNumbers = new ArrayList<>();
        int number = 1;

        // 3x 마을 숫자 리스트 생성
        while (validNumbers.size() < n) {
            if (number % 3 != 0 && !containsDigit3(number)) {
                validNumbers.add(number);
            }
            number++;
        }
        
        // n번째 숫자 반환
        return validNumbers.get(n - 1);
    }
    
    // 숫자가 3을 포함하고 있는지 확인
    private boolean containsDigit3(int num) {
        while (num > 0) {
            if (num % 10 == 3) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}