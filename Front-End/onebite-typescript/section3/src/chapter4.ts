/**
 * 대수 타입
 *  -> 여러 개의 타입을 합성해서 새롭게 만들어낸 타입
 *  -> 합집합 타입과 교집합 타입이 존재합니다.
 */

/**
 *  1. 합집합 - Union 타입
 */

let a : string | number | boolean;
a = 1;
a = "hello";
a = true;

let arr: (number | string | boolean)[] = [1,1,"hello"];

type Dog = {
    name : string;
    color : string;
}

type Person = {
    name: string;
    language: string;
};

type Union1 = Dog | Person;

let union1: Union1 = {
    name : "",
    color : "",
}

let union2: Union1 = {
    name : "",
    language : "",
}

let union3: Union1 = {
    name : "",
    language : "",
    color: "",
}

// let union4: Union1 = {
//     name : "",
// }

/**
 * 2. 교집합 타입 - Intersection 타입
 */

let variable: number & string;

type Intersection = Dog & Person;

let intersection: Intersection = {
    name:"",
    color:"",
    language:"",
};