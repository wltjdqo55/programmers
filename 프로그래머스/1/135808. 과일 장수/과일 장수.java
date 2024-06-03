import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int sum = 0;
        int[][] arr = new int[score.length/m][m];
        
        ArrayList<Integer> list = new ArrayList();   
        for(int i=0;i<score.length;i++){
            list.add(score[i]);
        }
        list.sort(Comparator.reverseOrder());
        
        int y = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = list.get(y++);
            }
        }
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i][arr[i].length-1] * m;
        }
        
        
        
        return sum;
    }
}