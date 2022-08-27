class Solution {
    public int[] solution(int n, int m) {
        // 유클리드 호제법
        // 최소공배수 n*m/최대공약수
        // 최대공약수
        int[] answer = new int[2];
        int num1 = Math.max(n,m);
        int num2 = Math.min(n,m);
        int r = num1 % num2;
        
        if(r==0){
            answer[0] = num2;
            answer[1] = n * m / num2;
        }
        
        while(r>0) {
            r = num1 % num2;
            if(r==0) {
                answer[0] = num2;
                answer[1] = n * m / num2;
            }
            num1 = num2;
            num2 = r;
        }
         
        return answer;
    }
}