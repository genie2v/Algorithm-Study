function solution(n)
{
    let answer = 0;
    let arr = (n+'').split('');
    
    answer = arr.reduce((acc, currentNumber) => acc + parseInt(currentNumber), 0);
    return answer;
}