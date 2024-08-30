function solution(t, p) {
    var answer = 0;
    let len = p.length;
    
    let arr = t.split("");
    for (let i = 0; i <= arr.length-len; i++) {
        let num = "";
        if (arr[i] != "0" || len == 1) {
            num = arr[i];
        }
        
        for (let j = 1; j < len; j++) {
            num += arr[i+j];
        }
        
        if (num * 1 <= p * 1) { answer++; }
    }
    
    return answer;
}