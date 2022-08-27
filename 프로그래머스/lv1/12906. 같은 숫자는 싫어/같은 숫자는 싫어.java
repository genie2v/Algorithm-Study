import java.util.*;

public class Solution {
    // Stack
    /*public Stack<Integer> solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(answer.empty()){
                answer.push(arr[i]);
            } else {
                if(answer.peek() != arr[i]){
                    answer.push(arr[i]);
                }
            }
        }

        return answer;
    }*/
    // ArrayList
    public int[] solution(int []arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int num = -9999;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != num){
                arrList.add(arr[i]);
                num = arr[i];
            }
        }
        
        int[] answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}