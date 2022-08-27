class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<=9;i++){
            int count = 0;
            for(int j=0; j<numbers.length;j++){
                if(i == numbers[j]){
                    count++;
                }
            }
            if(count == 0) answer += i;
        }
        
        // int sum = 45;
        // for(int i=0; i<numbers.length; i++){
        //     sum -= numbers[i];
        // }
        //answer = sum;
        return answer;
    }
}