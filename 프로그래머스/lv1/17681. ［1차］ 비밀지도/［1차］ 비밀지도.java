class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0;i<n;i++) {
            int sum = arr1[i] | arr2[i];
            String s = Integer.toBinaryString(sum);

            while(s.length()<n) {
                s = "0" + s;
            }
            answer[i] = s;
        }
        
        for(int i=0;i<answer.length;i++) {
            answer[i] = answer[i].replace("1","#").replace("0"," ");
        }

        return answer;
    }
}