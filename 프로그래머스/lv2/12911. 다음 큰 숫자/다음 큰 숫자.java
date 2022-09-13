class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toBinaryString(n);
        int oneCnt = num.length() - num.replace("1","").length();
        
        while(true) {
            n++;
            String num2 = Integer.toBinaryString(n);
            int oneCnt2 = num2.length() - num2.replace("1","").length();
            if(oneCnt==oneCnt2) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}