const http = require('http');

// 웹 서버 객체 생성
const server = http.createServer((req,res) => {
    res.setHeader("Content-type","text/plain");
    // req.url : 요청 경로
    // req.method : 요청 방식
    const { url, method } = req; // 구조 분해 할당
    if(method==="GET" && url ==="/home"){
        res.write("HOME");
        res.end();
    }
});

server.listen(3000, () => {
    console.log("서버 실행 중");
});

