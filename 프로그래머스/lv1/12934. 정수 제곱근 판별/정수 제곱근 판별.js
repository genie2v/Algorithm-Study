function solution(n) {
    let answer = 0;
    let num = Math.round(Math.sqrt(n));
    
    answer = ((num*num)==n) ? (num+1) * (num+1) : -1;
    return answer;
}