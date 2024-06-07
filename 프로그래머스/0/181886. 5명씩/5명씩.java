import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList();
        
        int idx = 0;
        for(int i=0;i<names.length;i++){
            if(i%5==0) list.add(names[i]);
        }
        
        
        return list.toArray(new String[list.size()]);
    }
}