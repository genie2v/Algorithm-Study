function solution(names) {
    var answer = names.filter((name,idx) => idx % 5 == 0);
    return answer;
}