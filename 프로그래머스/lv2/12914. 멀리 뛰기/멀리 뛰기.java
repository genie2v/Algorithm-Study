class Solution {
    public long solution(int n) {
        long answer = 0;
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        int sum = 1;
        
        for(int i=1;i<n;i++) {
            if(fibo[i]==0) {
                fibo[i] = (fibo[i-1]+fibo[i-2]) % 1234567;
            }
            sum += fibo[i];
        }
        
        answer = sum % 1234567;
        return answer;
    }
}