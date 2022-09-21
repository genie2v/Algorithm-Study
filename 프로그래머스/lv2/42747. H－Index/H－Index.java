import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // 내림차순 정렬
        for(int i=0;i<citations.length-1;i++) {
            for(int j=0;j<citations.length-1;j++) {
                if(citations[j] < citations[j+1]) {
                    int temp = citations[j];
                    citations[j] = citations[j+1];
                    citations[j+1] = temp;
                }
            }
        }
        
        for(int i=1;i<=citations.length;i++) {
            if(citations[i-1]<i) {
                answer = i-1;
                break;
            } else {
                answer = citations.length;
            }
        }
        return answer;
    }
}