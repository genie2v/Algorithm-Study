function solution(s){
    var answer = true;
    
    let pCnt = s.length - s.replace(/p/gi,'').length;
    let yCnt = s.length - s.replace(/y/gi,'').length;
    
    answer = (pCnt!=yCnt) ? false : true;

    return answer;
}