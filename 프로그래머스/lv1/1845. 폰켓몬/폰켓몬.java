import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        /* ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(nums[0]);
        
        for(int i=1; i<nums.length; i++){
            if(!arrList.contains(nums[i])){
                arrList.add(nums[i]);
            }
        }
        
        if(nums.length/2 < arrList.size()){
            answer = nums.length/2;
        } else {
            answer = arrList.size();
        }
        
        return answer; */
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        
        if(nums.length/2 < hashSet.size()){
            answer = nums.length/2;
        } else {
            answer = hashSet.size();
        }
        
        return answer;
    }
}