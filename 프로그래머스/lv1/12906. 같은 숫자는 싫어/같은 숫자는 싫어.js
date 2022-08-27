function solution(arr)
{
    //let answer = arr.filter((value,index) => value != arr[index+1]);
    //return answer;
    
    let answer = [];
    for(let i=0; i<arr.length; i++){
        if(arr[i] != arr[i+1]){
            answer.push(arr[i]);
        }
    }

    return answer;
}