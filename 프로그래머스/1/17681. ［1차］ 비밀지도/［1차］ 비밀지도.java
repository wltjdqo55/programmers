class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        int[][] myArr1 = new int[n][n];
        int[][] myArr2 = new int[n][n];
        
        for(int i=0;i<arr1.length;i++){
            int num = arr1[i];
            String binary = Integer.toBinaryString(num);
            if(binary.length()<n){
                int z = n-binary.length();
                for(int q=0;q<z;q++){
                    binary = "0"+binary;
                }
            }
            for(int j=0;j<binary.length();j++){
                int binaryNumber = Integer.parseInt(String.valueOf(binary.charAt(j)));
                myArr1[i][j] = binaryNumber;
            }                                      
        }
        
        for(int i=0;i<arr2.length;i++){
            int num = arr2[i];
            String binary = Integer.toBinaryString(num);
            if(binary.length()<n){
                int z = n-binary.length();
                for(int q=0;q<z;q++){
                    binary = "0"+binary;
                }
            }
            for(int j=0;j<binary.length();j++){
                int binaryNumber = Integer.parseInt(String.valueOf(binary.charAt(j)));
                myArr2[i][j] = binaryNumber;
            }                                      
        }
        
        for(int i=0;i<myArr1.length;i++){
            String str = "";
            for(int j=0;j<myArr1[i].length;j++){
                if(myArr1[i][j] == 1 || myArr2[i][j] == 1){
                    str += "#";
                }
                else{
                    str += " ";
                }
            }
            answer[i] = str;
        }
        
        
        return answer;
    }
}


// 1. arr1과 arr2의 이진수를 각각 뽑아 새로 생성한 2차원 배열에 담는다
// 2. arr1과 arr2의 2차원배열을 비교하면서 or조건으로 1차원 배열 answer에 #을 담는다. 