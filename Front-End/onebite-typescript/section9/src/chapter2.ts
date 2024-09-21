/**
 * infer : 조건부 타입에서 참이 되도록 특정 타입을 추론하는 문법
 * 추론 할 수 없는 경우에는 조건식이 거짓이 된다.
 * inference -> 추론하다.
 */

/* 
type Func = () => string;
type ReturnType<T> = T extends () => string ? string : never;
 */
// 매개변수는 없고 반환값의 타입이 string
type FuncA = () => string;
type FuncB = () => number;

type ReturnType<T> = T extends () => infer R ? R : never;

type A = ReturnType<FuncA>;
type B = ReturnType<FuncB>;
type C = ReturnType<number>;

type PromiseUnpack<T> = T extends Promise<infer R> ? R : never;
// 1. T는 프로미스 타입이어야 한다.
// 2. 프로미스 타입의 결과값 타입을 반환해야 한다.

type PromiseA = PromiseUnpack<Promise<number>>;
// number

type PromiseB = PromiseUnpack<Promise<string>>;
// string
