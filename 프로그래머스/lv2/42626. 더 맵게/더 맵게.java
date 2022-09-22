import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int n : scoville) queue.add(n);
        
        int count = 0;
        while(!queue.isEmpty()) {  
            if(queue.peek()>=K) {
                answer = count;
                break;
            }
            int food1 = queue.poll();
            if(queue.peek() == null) return -1;
            int food2 = queue.poll() * 2;
            int newFood = food1 + food2;
            queue.add(newFood);
            count++;
        }
        
        return answer;
    }
}