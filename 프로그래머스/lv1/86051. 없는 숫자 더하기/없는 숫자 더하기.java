class Solution {
    public int solution(int[] numbers) {
        // 방법1
        int answer = 0;
        /* for(int i=0; i<=9;i++){
            int count = 0;
            for(int j=0; j<numbers.length;j++){
                if(i == numbers[j]){
                    count++;
                }
            }
            if(count == 0) answer += i;
        } */
        
        // 방법2 총합45에서 있는 숫자를 빼는 방법
        int sum = 45;
        for(int i=0; i<numbers.length; i++){
            sum -= numbers[i];
        }
        answer = sum;
        return answer;
    }
}