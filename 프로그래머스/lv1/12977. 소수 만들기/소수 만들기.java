class Solution {
    public static boolean prime[] = new boolean[2998]; // 나올 수 있는 합의 최댓값 : 2997, 2997+1
    public int solution(int[] nums) {  
        int answer = 0;
        getPrime();
        
        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(!prime[sum]) answer++;
                }
            }
        }
        return answer;
    }
    
    public static void getPrime(){
        // true 소수X, false 소수
        prime[0] = prime[1] = true;
        
        for(int i=2;i<Math.sqrt(prime.length);i++) {
            if(prime[i]) continue;
            for(int j=i*i;j<prime.length;j+=i) {
                prime[j] = true;
            }
        }
    }
}