import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        
        for(int i=0;i<clothes.length;i++) {
            if(hashMap.containsKey(clothes[i][1])) {
                hashMap.put(clothes[i][1], (hashMap.get(clothes[i][1])+1));
            } else {
                hashMap.put(clothes[i][1],1);
            }
        }
        
        int[] comb = new int[hashMap.size()];
        int idx = 0;
        for(String key : hashMap.keySet()) {
            comb[idx] = hashMap.get(key) + 1;
            idx++;
        }
        
        int cases = 1;
        for(int n : comb) {
            cases *= n;
        }
        
        answer = cases - 1;
        return answer;
    }
}