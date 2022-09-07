class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.toLowerCase().split("");
        int idx = 0;
        
        for(String word : words) {
            answer += (idx==0) ? word.toUpperCase() : word;
            idx = (word.equals(" ")) ? 0 : idx + 1;        
        }
        return answer;
    }
}