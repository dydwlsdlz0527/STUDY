/**
 * promise 연습
 */

const successfunc = (item: string) => {
  console.log(item + "111");
};

const failfunc = (item: string) => {
  console.log(item);
};

const promiseTest = new Promise((successfunc, reject) => {
  successfunc("성공");
})
  .then((item) => {
    console.log("성공 후 작업 : " + item);
  })
  .catch((item) => {
    console.log("실패 후 작업 : " + item);
  });

/**
 * promise
 */

const promise = new Promise<number>((resolve, reject) => {
  setTimeout(() => {
    resolve(20);
    // reject("~~ 때문에 실패");
  }, 3000);
});

promise.then((response) => {
  console.log(response * 10);
});

// 실패했을 떄는 타입 추론을 할 수 없다.
promise.catch((error) => {
  if (typeof error === "string") {
    console.log(error);
  }
});

/**
 * 프로미스를 반환하는 함수의 타입을 정의
 */

interface Post {
  id: number;
  title: string;
  content: string;
}

function fetchPost(): Promise<Post> {
  return new Promise((resolve, rejects) => {
    setTimeout(() => {
      resolve({
        id: 1,
        title: "게시글 제목",
        content: "게시글 내용",
      });
    }, 3000);
  });
}

const postRequest = fetchPost();
postRequest.then((post) => {
  console.log(post.id);
});
