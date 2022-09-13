function solution(s) {
    let answer = Math.min(...s.split(' ')) + ' ' + Math.max(...s.split(' '));
    return answer;
}