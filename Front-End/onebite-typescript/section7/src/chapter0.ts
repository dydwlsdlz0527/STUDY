/**
 * 제네릭 (일반적인, 포괄적인)
 * 제네릭 함수? 일반적인 함수, 포괄적인 함수
 * 모든 타입에 두루두루 사용할 수 있는 함수
 * <T> : 타입 변수
 */

function func<T>(value: T): T {
  return value;
}

let arr = func<[number, number, number]>([1, 2, 3]);
