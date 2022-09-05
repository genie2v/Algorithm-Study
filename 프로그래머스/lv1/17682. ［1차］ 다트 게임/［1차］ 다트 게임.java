class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int idx = 0;
        String num = "";
        
        for(int i=0;i<dartResult.length();i++) {
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)) {
                num += String.valueOf(ch);
            } else {
                if(ch=='S'||ch=='D'||ch=='T') {
                    int n = Integer.parseInt(num);
                    if(ch=='S') scores[idx] = n;
                    else if(ch=='D') scores[idx] = n * n;
                    else if(ch=='T') scores[idx] = n * n * n;;
                    idx++;
                    num = "";
                } else {
                    if(ch=='*') {
                        scores[idx-1] *= 2;
                        if((idx-2)>=0) scores[idx-2] *= 2;
                    } else {
                        scores[idx-1] *= (-1);
                    }
                }
            }
        }
        
        for(int score : scores) {
            answer += score;
        }

        return answer;
    }
}