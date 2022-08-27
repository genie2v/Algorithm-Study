import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rank = {6,6,5,4,3,2,1};
        int zero = 0;
        int match = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        for(int win : win_nums) {
            hashSet.add(win);
        }
        
        for(int lotto : lottos) {
            if(lotto==0){
                zero++;
                continue;
            } else {
                if(hashSet.contains(lotto)) {
                    match++;
                }
            }            
        }
        
        int min_rank = match;
        int max_rank = match + zero;
        
        answer[0] = rank[max_rank];
        answer[1] = rank[min_rank];
        return answer;
    }
}