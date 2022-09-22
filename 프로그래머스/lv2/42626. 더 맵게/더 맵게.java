import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int n : scoville) queue.add(n);
        
        int count = 0;
        while(queue.size()>1 && queue.peek()<K) {  
            int food1 = queue.poll();
            int food2 = queue.poll() * 2;
            int newFood = food1 + food2;
            queue.add(newFood);
            count++;
        }
        answer = count;
        
        if(queue.peek()<K) answer = -1;
        
        return answer;
    }
}