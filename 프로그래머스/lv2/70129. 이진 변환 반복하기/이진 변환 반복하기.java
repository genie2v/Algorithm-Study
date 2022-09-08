class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int len = 0;
        int zero = 0;
        
        while(!s.equals("1")) {
            len = s.length();
            s = s.replace("0","");
            zero += (len-s.length());
            
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        
        answer[1] = zero;
        return answer;
    }
}