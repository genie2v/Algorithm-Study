function solution(number) {
    var answer = number.split('').reduce((sum, num) => sum + num * 1, 0) % 9;
    return answer;
}