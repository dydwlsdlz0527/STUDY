/**
 * interval : 매번 일어나야 하는 무언가를 의미한다.
 * 
 */

const clock = document.querySelector("h2#clock");

function sayHello() {
    const date = new Date();
    const hours = String(date.getHours()).padStart(2,"0");
    const minutes = String(date.getMinutes()).padStart(2,"0");
    const seconds = String(date.getSeconds()).padStart(2,"0");
    clock.innerHTML = `${hours}:${minutes}:${seconds}`;


}

/** 
 * 길이가 1인 문자열은 JS에게 padStart를 사용해서 pedding을 붙여달라고 한다.
 * "1".padStart(2,"0");
 * "01"
 */

//setInterval(sayHello, 5*1000);
//setTimeout(sayHello, 1*1000);
setInterval(sayHello, 1 * 1000);