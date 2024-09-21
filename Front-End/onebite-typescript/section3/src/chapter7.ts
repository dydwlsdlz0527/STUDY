/**
 * 타입 좁히기
 * 조건문 등을 이용해 넓은 타입에서 좁은 타입으로
 * 타입을 상황에 따라 좁히는 방법을 이야기
 * instanceof 오른쪽에는 왼쪽의 인스턴스인지 확인하는 것이기 때문에 객체가 와야한다. 타입은 X (value instanceof Person)
 */

type Person = {
    name: string;
    age: number;
};

function func(value: number | string | Date | null | Person){
    if ( typeof value === 'number'){

    }else if(typeof value === 'string'){

    }else if (value instanceof Date){

    }else if (value && "age" in value){

    }

}