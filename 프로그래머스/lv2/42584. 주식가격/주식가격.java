import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int price : prices) {
            queue.add(price);
        }
        
        int idx = 0;
        while(!queue.isEmpty()) {
            int time = 0;
            int currentPrice = queue.peek();
            for(int price : queue) {
                time++;
                if(price < currentPrice) break;
            }
            answer[idx] = time - 1;
            idx++;
            queue.poll(); 
        }
        
        return answer;
    }
}