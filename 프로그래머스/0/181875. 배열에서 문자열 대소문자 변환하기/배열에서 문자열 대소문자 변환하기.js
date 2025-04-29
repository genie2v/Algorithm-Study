function solution(strArr) {
    var answer = strArr.map((str,idx) => 
           idx % 2 == 0 ? str.toLowerCase() : str.toUpperCase());
    return answer;
}