function solution(s) {
    let answer = 0;
    let nums = [/zero/g, /one/g, /two/g, /three/g, /four/g, /five/g,
                /six/g, /seven/g, /eight/g, /nine/g];
    
    for(let i=0; i<nums.length; i++){
        s=s.replace(nums[i], i);
    }
    answer = parseInt(s);
    
    return answer;
}