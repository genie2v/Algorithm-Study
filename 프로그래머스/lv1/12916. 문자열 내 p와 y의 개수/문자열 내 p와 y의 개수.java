class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // 방법1
        s = s.toLowerCase();
        int pCnt = s.length() - (s.replace("p","")).length();
        int yCnt = s.length() - (s.replace("y","")).length();
        
        if(pCnt != yCnt) answer = false;
        
        // 방법2
        /*s = s.toUpperCase();
        int pCnt = 0;
        int yCnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'Y'){
                yCnt++;
            } else if(s.charAt(i) == 'P'){
                pCnt++;
            }
        }   
        if(yCnt != pCnt) answer = false;*/
        
        return answer;
    }
}