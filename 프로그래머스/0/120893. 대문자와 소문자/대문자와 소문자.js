function solution(my_string) {
    var answer = [...my_string].map(str =>
        str === str.toLowerCase() ? str.toUpperCase() : str.toLowerCase()).join('');
    return answer;
}