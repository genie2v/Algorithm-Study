function solution(num_list) {
    var answer = [];
    let odd = 0, even = 0;
    
    for (num of num_list) {
        if (num % 2 != 0) odd++;
        else even++;
    }
    
    answer = [even, odd];
    
    return answer;
}