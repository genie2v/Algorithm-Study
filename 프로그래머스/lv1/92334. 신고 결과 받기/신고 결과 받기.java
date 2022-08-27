import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String,Integer> user_index = new HashMap<>();
        HashMap<String,HashSet<String>> hashMap = new HashMap<>(); // 신고당한ID,신고한ID
        
        // 초기화
        for(int i=0; i<id_list.length; i++){
            user_index.put(id_list[i],i);
            hashMap.put(id_list[i],new HashSet<>());
        }
        
        for(int j=0; j<report.length; j++){
            String[] str = report[j].split(" ");
            // str[1] 신고당한ID, str[0] 신고한ID
            hashMap.get(str[1]).add(str[0]);
        }
        
        for(int i=0; i<id_list.length; i++){
            HashSet<String> send = hashMap.get(id_list[i]);
            if(send.size() >= k){
                for(String name:send){
                    answer[user_index.get(name)]++;
                }
            }
        }
        
        return answer;
    }
}