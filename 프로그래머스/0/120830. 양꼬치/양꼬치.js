function solution(n, k) {
    var answer = 0;
    
    let j = parseInt(n/10);
    answer = (12000 * n) + (2000 * k) - (2000 * j);
    
    return answer;
}