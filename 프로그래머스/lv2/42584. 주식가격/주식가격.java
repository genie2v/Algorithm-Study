import java.util.*;

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