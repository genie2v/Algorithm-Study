import java.util.*;
import java.awt.Point;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Point> queue = new LinkedList<Point>();
        
        for(int i=0;i<priorities.length;i++) {
            // x = priority, y = index
            queue.add(new Point(priorities[i],i));
        }
        
        while(!queue.isEmpty()) {
            int currentPriority = queue.peek().x;
            boolean flag = false;
            
            for(Point priority : queue) {
                if(priority.getX() > currentPriority) {   
                    flag = true;
                    break;
                }
            }
            
            if(flag) {
                queue.add(queue.poll());
            } else {
                answer++;
                if(queue.peek().y==location) return answer;
                queue.poll();
            }
        }
        
        return answer;
    }
}