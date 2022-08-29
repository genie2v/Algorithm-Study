import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String result="";
        String[] num = String.valueOf(n).split("");
        Arrays.sort(num);
        
        for(int i=num.length-1;i>=0;i--) {
            result += num[i];
        }
        
        answer = Long.parseLong(result);
        return answer;
    }
}