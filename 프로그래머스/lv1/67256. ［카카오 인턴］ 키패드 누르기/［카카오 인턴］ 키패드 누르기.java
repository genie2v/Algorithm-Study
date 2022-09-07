class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        // 0,1,2,3,4,5,6,7,8,9
        int[][] number = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
        int[] leftHand = {3,0};
        int[] rightHand = {3,2};
        
        for(int num : numbers) {
            if(num==1||num==4||num==7) {
                answer += "L";
                leftHand = number[num];
            } else if(num==3||num==6||num==9) {
                answer += "R";
                rightHand = number[num];
            } else {
                int leftDist = Math.abs(number[num][0]-leftHand[0]) + Math.abs(number[num][1]-leftHand[1]);
                int rightDist = Math.abs(number[num][0]-rightHand[0]) + Math.abs(number[num][1]-rightHand[1]);
                if(leftDist<rightDist) {
                    answer += "L";
                    leftHand = number[num];
                } else if(leftDist>rightDist) {
                    answer += "R";
                    rightHand = number[num];
                } else {
                    if(hand.equals("right")) {
                        answer += "R";
                        rightHand = number[num];
                    } else {
                        answer += "L";
                        leftHand = number[num];
                    }
                }
            }
        }

        return answer;
    }
}