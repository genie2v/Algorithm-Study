import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> people = new HashMap<String,Integer>();
        
        for(String p : participant){
            if(people.containsKey(p)){
                people.put(p,(people.get(p))+1);
            } else {
                people.put(p,1);
            }
        }
        
        for(String c : completion){
            if(people.containsKey(c)){
                people.put(c,(people.get(c))-1);
            }
        }
        
        Iterator<String> iterator = people.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            if(people.get(key)!=0) answer = key;
        }
        
        return answer;
    }
}