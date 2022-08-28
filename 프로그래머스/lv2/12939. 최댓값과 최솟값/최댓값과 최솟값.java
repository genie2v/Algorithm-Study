import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] num = s.split(" ");
        int[] arr = new int[num.length];
        
        for(int i=0;i<num.length;i++) {
            arr[i] = Integer.parseInt(num[i]);
        }
        Arrays.sort(arr);
        
        String min = String.valueOf(arr[0]);
		String max = String.valueOf(arr[arr.length-1]);
        
        answer = min + " " + max;
        return answer;
    }
}