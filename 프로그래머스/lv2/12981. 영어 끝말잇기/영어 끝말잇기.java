import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int player = 1;
        int turn = 1;
        String prev = "";
        HashMap<String,Integer> word = new HashMap<String,Integer>();
        
        for(int i=0;i<words.length;i++) {
            String now = words[i];

            // 단어 규칙 확인
            if(i>0) {
                char prevChar = prev.charAt(prev.length()-1);
                char nowChar = now.charAt(0);
                if(nowChar!=prevChar || word.containsKey(now)) {
                    answer[0] = player;
                    answer[1] = turn;
                    break;
                }
            }
            
            word.put(now,0);
            
            prev = now;
            
            if(player==n) {
                player = 1;
                turn++;
                continue;
            }
            
            player++;
        }

        return answer;
    }
}