/**
 * 접근 제어자
 * access modifier
 * => public private protected
 * public(default) : 모두 허용
 * private : 자신 클래스까지 허용
 * protected : 파생 클래스까지 허용
 * 생성자에 접근 제어자를 달아주면 필드값에 자동으로 할당해준다. this.name = name 안해도 됨
 */

class Employee {
  // 생성자
  constructor(
    private name: string,
    protected age: number,
    public position: string
  ) {}
  // 메서드
  work() {
    console.log("일함");
  }

  func() {}
}

const employee = new Employee("아무개", 33, "developer");
//employee.name = "홍길동";
//employee.age = 30;
//employee.position = "디자이너";
employee.position = "디자이너";

console.log(employee);
