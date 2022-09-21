import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        int idx = 0;
        
        while(idx!=progresses.length) {
            int today = 0;
            queue.clear();
            for(int i=idx;i<progresses.length;i++) {
                progresses[i] += speeds[i];
                queue.add(progresses[i]);
            }
            
            while(!queue.isEmpty()) {
                if(queue.peek()>=100) {
                    queue.poll();
                    today++;
                    idx++;
                } else break;
            }
            
            if(today!=0) arrList.add(today);
        }
        
        int[] answer = new int[arrList.size()];
        for(int i=0;i<answer.length;i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}