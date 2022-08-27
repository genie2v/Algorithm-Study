class Solution {
    public long solution(long n) {
        long answer = 0;
        long num = (long)Math.sqrt(n);
        
        answer = ((num*num)==n) ? (num+1) * (num+1) : -1;
        
        return answer;
    }
}