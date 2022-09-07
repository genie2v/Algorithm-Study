import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int point = 0;
        String type = "";
        String[][] test = {{"R","T"},{"C","F"},{"J","M"},{"A","N"}};
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        
        for(String[] str : test) {
            System.out.println(str[0] + " " + str[1]);
            hashMap.put(str[0],0);
            hashMap.put(str[1],0);
        }
        
        for(int i=0;i<choices.length;i++) {
            String[] str = survey[i].split("");
            if(choices[i]==4) {
                continue;
            } else if(choices[i]<4) {
                type = str[0];
                point = 4 - choices[i];
            } else {
                type = str[1];
                point = choices[i] - 4;
            }
            hashMap.put(type,(hashMap.get(type)+point));
        }
        
        for(int i=0;i<test.length;i++) {
            if(hashMap.get(test[i][0])>=hashMap.get(test[i][1]))
                answer += test[i][0];
            else answer += test[i][1];
        }
        
        return answer;
    }
}