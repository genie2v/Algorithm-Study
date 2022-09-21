import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hashSet = new HashSet<String>();
        
        for(String number : phone_book) {
            hashSet.add(number);
        }
        
        for(int i=0;i<phone_book.length;i++) {
            for(int j=0;j<phone_book[i].length();j++) {
                if(hashSet.contains(phone_book[i].substring(0,j))) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}