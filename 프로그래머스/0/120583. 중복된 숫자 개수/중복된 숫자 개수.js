function solution(array, n) {
    var answer = 0;
    array.forEach(number => {
        if (number == n) answer++;
    });
    return answer;
}