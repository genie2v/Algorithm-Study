function solution(myString) {
    var answer = myString.split("x").map(str => str.length);
    return answer;
}