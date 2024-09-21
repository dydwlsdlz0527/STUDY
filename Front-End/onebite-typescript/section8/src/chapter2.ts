/**
 * keyof 연산자
 */

/* interface Person {
  name: string;
  age: number;
} */

type Person = typeof person;

function getPropertyKey(person: Person, key: keyof typeof person) {
  return person[key];
}

const person = {
  name: "김용진",
  age: 33,
};

getPropertyKey(person, "name");
