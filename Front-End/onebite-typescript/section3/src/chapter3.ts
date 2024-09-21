/**
 * 기본 타입간의 호환성
 */

let num1: number = 10;
let num2: 10 = 10;

/**
 * 객체 타입간의 호환성
 *  -> 어떤 객체 타입을 다른 객체 타입으로 취급해도 괜찮은가?
 *  Anymal type이 구조적으로 더 크다. (typescript는 구조적 타입 시스템)
 */

type Animal = {
    name: string;
    color: string;
};

type Dog = {
    name: string;
    color: string;
    breed: string;
};

let animal: Animal = {
    name: "기린",
    color: "yellow",
};

let dog: Dog = {
    name: "돌돌이",
    color: "brown",
    breed: "진도",
};

animal = dog;
//dog = animal;

type Book = {
    name: string;
    price: number;
};

type ProgrammingBook = {
    name: string;
    price: number;
    skill: string;
};

let book: Book;
let programmingBook: ProgrammingBook = {
    name: "한 입 크기로 잘라먹는 리액트",
    price: 33000,
    skill: "reactjs",
};

book = programmingBook;

/**
 * 초과 프로퍼티 검사
 */
let book2: Book = {
    name: "한 입 크기로 잘라먹는 리액트",
    price: 33000,
    //skill: "reactjs",
};

// 객체 리터럴을 사용하지 않은 경우에는 가능하다.
let book3: Book = programmingBook;


// 파라미터를 사용할 때에도 리터럴은 오류를 낸다.
function func(book:Book){}
func(programmingBook);