class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==' ') {
                answer += " ";
                continue;
            }
            
            int code = (int)arr[i] + n;
            if(code > 90 && arr[i] <= 90 || code > 122) {
                answer += String.valueOf((char)(code-26));
            } else {
                answer += String.valueOf((char)code);
            }
        }
        
        return answer;
    }
}