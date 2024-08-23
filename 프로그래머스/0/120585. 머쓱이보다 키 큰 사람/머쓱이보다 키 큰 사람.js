function solution(array, height) {
    var answer = 0;
    
    array.forEach(ele => {
        if (ele > height) answer++;
    });
    
    return answer;
}