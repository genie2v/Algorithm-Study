import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        for(int i=0;i<numbers.length-1;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                hashSet.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = new int[hashSet.size()];
        Iterator<Integer> iterator = hashSet.iterator();
        int index = 0;
        while(iterator.hasNext()) {
            answer[index] = iterator.next();
            index++;
        }
        Arrays.sort(answer);
        return answer;
    }
}