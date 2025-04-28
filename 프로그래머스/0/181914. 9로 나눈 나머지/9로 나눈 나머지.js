function solution(number) {
    var answer = [...number].reduce((sum, num) => sum + num * 1, 0) % 9;
    return answer;
}