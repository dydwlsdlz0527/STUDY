// any ( 어떤 타입이든 넣을 수 있다. )
// 특정 변수의 타입을 우리가 확실히 모를 때
// any 타입은 타입 검사를 안하는 것과 동일하다.. 런타임 시 에러가 발생.

let anyVar: any = 10;
anyVar = "hello";

let num: number = 10;

// unknown
let unknownVar: unknown;
unknownVar = "";
unknownVar = 1;

if (typeof unknownVar === "number") {
    num = unknownVar;
}