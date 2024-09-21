/**
 * Pick<T, K>
 */

interface Post {
  title: string;
  tags: string[];
  content: string;
  thumbnailURL?: string;
}

const legacyPost: Pick<Post, "title" | "content"> = {
  title: "옛날 글",
  content: "옛날 컨텐츠",
};

type Pick<T, K extends keyof T> = {
  // K extneds 'title' | 'tags' | 'content' | 'thumbnailURL'
  // 'title' | 'content' extneds 'title' | 'tags' | 'content' | 'thumbnailURL'
  [key in K]: T[key];
};

type Omit<T, K extends keyof T> = Pick<T, Exclude<keyof T, K>>;
// T = Post, K = 'title'
// Pick<Post, Exclude<keyof Post, 'title'>>
// Pick<Post, Exclude<'title'|'content'|'tags'|'thumbnailURL','title'>>
// Pick<Post, 'content' | 'tags' | 'thumbnailURL'>

const noTitlePost: Omit<Post, "title"> = {
  content: "",
  tags: [],
  thumbnailURL: "",
};

/**
 * Recode<K, V>
 */
/* 
type Thumbnail = {
    large: {
      url: string;
    };
    medium: {
      url: string;
    };
    small: {
      url: string;
    };
  };
 */
type Thumbnail = Record<"large" | "medium" | "small", { url: string }>;

type Recode<K extends keyof any, V> = {
  [key in K]: V;
};
