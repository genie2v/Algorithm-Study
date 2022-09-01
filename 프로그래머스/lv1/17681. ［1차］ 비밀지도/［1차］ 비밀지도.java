class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0;i<n;i++) {
            String pwd = Integer.toBinaryString(arr1[i] | arr2[i]);
            while(pwd.length()<n) {
                pwd = "0" + pwd;
            }
            answer[i] = pwd;
        }
        
        for(int i=0;i<answer.length;i++) {
            answer[i] = answer[i].replace("1","#").replace("0"," ");
        }

        return answer;
    }
}