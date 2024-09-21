/**
 * 제네릭 클래스
 */

class List<T> {
  constructor(private list: T[]) {}

  push(data: T) {
    this.list.push(data);
  }

  pop() {
    return this.list.pop();
  }

  print() {
    console.log(this.list);
  }
}

const numberList = new List<number>([1, 2, 3]);
numberList.pop();
numberList.push(4);
numberList.print();

// 타입을 명시하지 않아도 클래스는 추론한다.
const stringList = new List(["1", "2"]);
