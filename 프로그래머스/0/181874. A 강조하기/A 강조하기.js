function solution(myString) {
    var answer = [...myString].map(str =>
        str.toUpperCase() == "A" ? str.toUpperCase() : str.toLowerCase()
    ).join('');
    return answer;
}