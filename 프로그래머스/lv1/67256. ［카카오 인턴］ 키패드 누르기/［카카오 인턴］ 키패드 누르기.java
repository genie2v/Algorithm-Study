class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHand = 10;
        int rightHand = 12;
        
        for(int num : numbers) {
            if(num==1||num==4||num==7) {
                answer += "L";
                leftHand = num;
            } else if(num==3||num==6||num==9) {
                answer += "R";
                rightHand = num;
            } else {
                if(num == 0) num = 11;
                int leftDist = (Math.abs(num-leftHand) / 3) + (Math.abs(num-leftHand) % 3);
                int rightDist = (Math.abs(num-rightHand) / 3) + (Math.abs(num-rightHand) % 3);
                if(leftDist<rightDist) {
                    answer += "L";
                    leftHand = num;
                } else if(leftDist>rightDist) {
                    answer += "R";
                    rightHand = num;
                } else {
                    if(hand.equals("right")) {
                        answer += "R";
                        rightHand = num;
                    } else {
                        answer += "L";
                        leftHand = num;
                    }
                }
            }
        }
        
        return answer;
    }
}