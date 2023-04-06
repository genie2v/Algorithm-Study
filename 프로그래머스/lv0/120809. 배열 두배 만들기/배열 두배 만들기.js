function solution(numbers) {
    var answer = [];
    numbers.forEach(function(number){
        answer.push(number * 2);
    });
    return answer;
}