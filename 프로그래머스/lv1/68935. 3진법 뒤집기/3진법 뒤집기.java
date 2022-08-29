class Solution {
    public int solution(int n) {
        int answer = 0;
        String base3 = "";
        
        while(n>0) {
            base3 += n%3;
            n /= 3;
        }
        // base3 0021 /0*9+0*3+2*3+1*1=7
        char[] chBase3 = base3.toCharArray();
        for(int i=chBase3.length-1,j=0;i>=0;i--) {
            answer += Character.getNumericValue(chBase3[i]) * (int)Math.pow(3, j);
            j++;
        }
        return answer;
    }
}