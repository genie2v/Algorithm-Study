function solution(num_str) {
    let answer = num_str.split('').reduce((sum, num) => sum + (num * 1), 0);
    return answer;
}