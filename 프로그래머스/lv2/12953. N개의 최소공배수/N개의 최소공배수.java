class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int n = arr[0];
        
        for(int i=1;i<arr.length;i++) {
            int gcd = gcd(n,arr[i]);
            n = n * arr[i] / gcd;
        }
        
        answer = n;
        return answer;
    }
    
    public int gcd(int a, int b) {
        int num1 = Math.max(a,b);
        int num2 = Math.min(a,b);
        
        while((num1%num2)>0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        
        return num2;
    }
}