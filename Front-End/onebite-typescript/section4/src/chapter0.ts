/**
 * 함수 타입 정의
 */


function func(a: number, b:number){
    return a+b;
}

/**
 * 화살표 함수의 타입을 정의하는 방법
 */

const add = (a: number, b: number) => a + b;

/**
 * 함수의 매개변수
 * 선택적 매개변수는 필수 매개 변수 뒤에 있어야 한다.
 */

function introduce(name = "김용진"){
    console.log(`name :  + ${name}`);
}

function getSum(...rest: number[]){
    let sum = 0;
    rest.forEach((it)=>(sum+=it));
    return sum;
}

function getSum2(...rest: [number, number, number]){
    let sum = 0;
    rest.forEach((it)=>(sum+=it));
    return sum;
}