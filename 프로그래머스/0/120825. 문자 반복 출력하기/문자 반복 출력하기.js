function solution(my_string, n) {
    var answer = '';
    [...my_string].forEach(i => {
        answer += i.repeat(n);
    })
    
    return answer;
}