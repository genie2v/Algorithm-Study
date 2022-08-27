function solution(participant, completion) {
    let answer = '';
    const people = new Map();
    
    participant.forEach((name) => people.set(name, (people.get(name) || 0) + 1));
    completion.forEach((name) => people.set(name, people.get(name) -1));
    
    for(let name of people.keys()){
        if(people.get(name) != 0){
            answer = name;
        }        
    }    
    return answer;
}