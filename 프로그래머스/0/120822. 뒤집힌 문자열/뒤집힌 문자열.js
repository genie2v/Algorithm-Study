function solution(my_string) {
    var answer = '';
    let len = my_string.length;
    
    for (let i = len - 1; i >= 0; i--) {
        answer += my_string.charAt(i);
    }
    
    return answer;
}