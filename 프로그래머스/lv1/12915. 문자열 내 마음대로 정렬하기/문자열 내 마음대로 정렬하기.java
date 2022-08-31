import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> arrList = new ArrayList<String>();
        for(int i=0;i<strings.length;i++) {
            arrList.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arrList);
        
        String[] answer = new String[arrList.size()];
        for(int i=0;i<answer.length;i++) {
            answer[i] = arrList.get(i).substring(1);
        }
        return answer;
    }
}