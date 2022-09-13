import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++) {
            switch(s.charAt(i)) {
                case '(' :
                    stack.push(s.charAt(i));
                    break;
                case ')' :
                    if(stack.empty()) return false;
                    else if(stack.peek().equals('(')) {
                        stack.pop();
                        break;
                    }
            }
        }
        
        if(!stack.empty()) answer = false;

        return answer;
    }
}