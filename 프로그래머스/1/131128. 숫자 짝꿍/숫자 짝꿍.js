function solution(X, Y) {
    X = [...X];
    Y = [...Y];
    
    let rslt = "";
    
    for (let i = 0; i < 10; i++) {
        xCnt = X.filter(x => Number(x) == i).length;
        yCnt = Y.filter(y => Number(y) == i).length;
        
        rslt += i.toString().repeat(Math.min(xCnt,yCnt));
    }
    
    if (rslt.length == 0) return "-1";
    else if (Number(rslt) == 0) return "0";
    else return rslt.split("").sort().reverse().join("");
    
}