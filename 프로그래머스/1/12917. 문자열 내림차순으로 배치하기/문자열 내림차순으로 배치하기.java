import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArr = s.toCharArray();
        char[] arr = new char[chArr.length];
        Arrays.sort(chArr);
        for(int i=chArr.length-1,j=0;i>=0;i--,j++){
            arr[j] = chArr[i];
        }
        answer = new String(arr);
        return answer;
    }
}