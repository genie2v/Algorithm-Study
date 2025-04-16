function solution(cipher, code) {
    var answer = cipher.split('').filter((elem,idx) => (idx+1) % code == 0).join('');
    return answer;
}