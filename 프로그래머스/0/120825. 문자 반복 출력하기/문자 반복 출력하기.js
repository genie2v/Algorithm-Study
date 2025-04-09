function solution(my_string, n) {
    var answer = '';
    my_string.split('').forEach(i => {
        answer += i.repeat(n);
    })
    
    return answer;
}