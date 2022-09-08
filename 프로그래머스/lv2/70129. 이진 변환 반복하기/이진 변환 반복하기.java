class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        int len = 0;
        
        while(!s.equals("1")) {
            len = s.length();
            s = s.replace("0","");
            zero += (len-s.length());
            
            s = Integer.toBinaryString(s.length());
            count++;
        }
        
        answer[0] = count;
        answer[1] = zero;
        return answer;
    }
}