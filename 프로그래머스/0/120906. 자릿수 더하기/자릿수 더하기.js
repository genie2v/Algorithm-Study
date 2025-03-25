function solution(n) {
    var answer = n.toString().split('').map(Number).reduce((sum, num) => sum + num, 0);
    return answer;
}