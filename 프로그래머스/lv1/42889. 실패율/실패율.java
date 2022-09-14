import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer,Double> hashMap = new HashMap<Integer,Double>();
        int player = stages.length;
        
        for(int i=1;i<=N;i++) {
            int failUsr = 0;
            for(int j=0;j<stages.length;j++) {
                if(stages[j]==i) failUsr++;
            }
            double fail = (player==0) ? 0.0 : failUsr/(double)player;
            hashMap.put(i,fail);
            player = player - failUsr;
        }
        
        ArrayList<Integer> listKeySet = new ArrayList<Integer>(hashMap.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (hashMap.get(value2).compareTo(hashMap.get(value1))));
        int idx = 0;
        for(int key : listKeySet) {
            //System.out.println(key + " : " + hashMap.get(key));
            answer[idx++] = key;
        }

        return answer;
    }
}