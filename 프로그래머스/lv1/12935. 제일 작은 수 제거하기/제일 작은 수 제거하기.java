import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int min = 9999;
        if(arr.length==1) {
            return answer;
        }
        
        answer = new int[arr.length-1];
        
        for(int i : arr) {
            arrList.add(i);
            if(min > i) min = i;
        }
        arrList.remove(Integer.valueOf(min));
        
        for(int i=0;i<arrList.size();i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}