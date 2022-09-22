import java.util.*;

// Stack
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<Integer>();
        
        // 가격이 떨어지는 지점 계산
        for(int i=0;i<prices.length;i++) {
            while(!stack.empty() && prices[stack.peek()] > prices[i]) {
                answer[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        
        // 가격이 떨어지지 않는 지점 계산
        while(!stack.empty()) {
            answer[stack.peek()] = prices.length - stack.pop() - 1;
        }
        
        return answer;
    }
}

// Queue
/* class Solution {
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
                // 가격이 떨어지면 break
                if(price < currentPrice) break;
            }
            // 순회하면서 자기자신도 포함했기 때문에 자기자신은 빼준다
            answer[idx] = time - 1;
            idx++;
            queue.poll(); 
        }
        
        return answer;
    }
} */