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
            
            answer += ((idx%2)==0) ? str.toUpperCase() : str.toLowerCase();
            idx++;
        }
        
        return answer;
    }
}