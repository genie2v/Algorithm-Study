import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++) {
            int[] newList = new int[commands[i][1]-commands[i][0]+1];
            
            int k=0;
            for(int j=commands[i][0];j<=commands[i][1];j++) {
                newList[k] = array[j-1];
                k++;
            }
            Arrays.sort(newList);
            answer[i] = newList[commands[i][2]-1];
        }    
        return answer;
    }
}