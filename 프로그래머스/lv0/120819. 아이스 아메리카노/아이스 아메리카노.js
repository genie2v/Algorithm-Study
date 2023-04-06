function solution(money) {
    var answer = [];
    
    var cnt = Math.floor(money / 5500);
    var remain = money % 5500;
    answer.push(cnt);
    answer.push(remain);
    
    return answer;
}