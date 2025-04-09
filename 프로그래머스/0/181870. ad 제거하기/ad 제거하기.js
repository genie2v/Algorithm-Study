function solution(strArr) {
    var answer = strArr.filter(str => str.indexOf('ad') == -1);
    return answer;
}