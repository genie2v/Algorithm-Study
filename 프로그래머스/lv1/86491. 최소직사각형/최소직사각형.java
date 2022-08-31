class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] sort = new int[sizes.length][2];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i=0;i<sizes.length;i++) {
            int num1 = Math.max(sizes[i][0],sizes[i][1]);
            int num2 = Math.min(sizes[i][0],sizes[i][1]);
            sort[i][0] = num1;
            sort[i][1] = num2;
        }
        
        for(int i=0;i<sort.length;i++) {
            if(sort[i][0]>max1) max1 = sort[i][0];
            if(sort[i][1]>max2) max2 = sort[i][1];
        }
        
        answer = max1 * max2;
        return answer;
    }
}