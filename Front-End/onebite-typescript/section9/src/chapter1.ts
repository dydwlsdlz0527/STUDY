/**
 * 분산적인 조건부 타입
 * 조건부 타입이 분산적으로 동작할 수 있게 업그레이드 하는 것
 */

type StringNumberSwitch<T> = T extends number ? string : number;

// 조건부 타입이 분산적으로 사용하지 않으려면 [] 를 붙여주면 된다.
type StringNumberSwitch2<T> = [T] extends [number] ? string : number;
let e: StringNumberSwitch2<boolean | number | string>;

let a: StringNumberSwitch<number>;
let b: StringNumberSwitch<string>;

// Union 타입이 파라미터로 들어오면 한 번은 number, 한 번은 stirng으로 들어온다.
let c: StringNumberSwitch<number | string>;
//let c: StringNumberSwitch<number>;
//let c: StringNumberSwitch<string>;
//한 번씩 들어가서 결과를 Union으로 묶는다.

let d: StringNumberSwitch<boolean | number | string>;
// 1 단계
// StringNumberSwitch<boolean> |
// StringNumberSwitch<number>  |
// StringNumberSwitch<string>

// 2 단계
// number   |
// string   |
// number

// 결과
// number | string

/**
 * 실용적인 예제
 * 특정 타입만 제거할 수 있다.
 */
type Exclude<T, U> = T extends U ? never : T;

type A = Exclude<number | string | boolean, string>;

type Extract<T, U> = T extends U ? T : never;
type B = Extract<number | string | boolean, string>;
