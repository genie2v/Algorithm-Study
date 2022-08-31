import java.util.*;

class Solution {
    // 수포자 1 : 12345
    // 수포자 2 : 21232425
    // 수포자 3 : 3311224455
    public int[] solution(int[] answers) {
        int user1[] = {1, 2, 3, 4, 5};
        int user2[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int user3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score[] = new int[3];
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int i=0;i<answers.length;i++) {
            if(answers[i]==user1[i%user1.length]) score[0]++;
            if(answers[i]==user2[i%user2.length]) score[1]++;
            if(answers[i]==user3[i%user3.length]) score[2]++;
        }
        
        int max = Math.max(score[0],Math.max(score[1],score[2]));
        for(int i=0;i<3;i++) {
            if(max==score[i]) arrList.add(i+1);
        }
        
        int[] answer = new int[arrList.size()];
        for(int i=0;i<answer.length;i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}