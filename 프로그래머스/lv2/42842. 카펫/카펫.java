class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
        for(int h=3;h<area/2;h++) {
            if((area%h)==0) {
                int w = area / h;
                if(((h-2)*(w-2))==yellow) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        
        return answer;
    }
}