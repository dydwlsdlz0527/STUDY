/**
 * 맵드 타입 기반의 유틸리티 타입
 */

//Partial<T>
interface Post {
  title: string;
  tags: string[];
  content: string;
  thumbnailURL?: string;
}

type Partial<T> = {
  [key in keyof T]?: T[key];
};

const draft: Partial<Post> = {
  title: "제목..",
  content: "초안..",
};

//Required<T>
const withThumbnailPost: Required<Post> = {
  title: "한입 타슽 후기",
  tags: ["ts"],
  content: "",
  thumbnailURL: "https://...",
};

type Required<T> = {
  [key in keyof T]-?: T[key];
};

/**
 * Readonly<T>
 * -> 읽기 전용 수정 불가
 * -> 특정 객체 타입에서 모든 프로퍼티를 읽기 전용 프로퍼티로 만들어주는 타입
 */

const readonlyPost: Readonly<Post> = {
  title: "보호된 게시글 입니다.",
  tags: [],
  content: "",
};

type Readonly<T> = {
  readonly [key in keyof T]: T[key];
};
