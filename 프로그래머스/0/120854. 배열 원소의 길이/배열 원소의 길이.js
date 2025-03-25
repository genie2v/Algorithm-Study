function solution(strlist) {
    var answer = [];
    // strlist.forEach(str => { answer.push(str.length) ; });
    answer = strlist.map(str => str.length);
    return answer;
}