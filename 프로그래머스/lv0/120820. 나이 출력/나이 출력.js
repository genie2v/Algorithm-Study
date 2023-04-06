function solution(age) {
    var answer = 0;
    var date = new Date();
    var yyyy = date.getFullYear();
    
    answer = yyyy - age;
    return answer;
}