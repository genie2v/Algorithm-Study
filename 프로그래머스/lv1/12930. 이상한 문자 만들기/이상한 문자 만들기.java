class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split("");
        int idx = 0;
        
        for(String str : words) {
            if(str.equals(" ")) {
                idx = 0;
                answer += str;
                continue;
            }
            if((idx%2)==0) {
                answer += str.toUpperCase();
            } else {
                answer += str.toLowerCase();
            }
            idx++;
        }
        
        return answer;
    }
}