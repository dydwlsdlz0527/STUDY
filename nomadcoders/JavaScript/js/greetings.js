/* const loginForm = document.getElementById("login-form");
const loginInput = loginForm.querySelector("input");
const loginButton = loginForm.querySelector("button");  */
const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form input");
//const loginButton = document.querySelector("#login-form button");
//const loginButton = document.querySelector("#login-form button");
const greeting = document.querySelector("#greeting");
//일반적으로 Stirng만 포함된 변수는 대문자로 표기하고, String을 저장하고 싶을 때 사용한다.
const HIDDEN_CLASSNAME = "hidden";
const USERNAME_KEY = "username";

/* function onLoginBtnClick(){
    const value = loginInput.value;
    if(value==""){
        alert("Please write your name");
    }else if(username.length>15){
        alert("Your name is too long.")
    } 
}
*/
//loginButton.addEventListener("click",onLoginBtnClick);

/**
 * 
 * @param {*} event 
 * JS에서는 공짜로 첫 번째 argument로 발생된 event에 대한 정보를 준다.
 */
function onLoginSubmit(event) {
    event.preventDefault();
    /*
        preventDefault 함수는 어떤 event의 기본 행동이든지 발생되지 않도록 막는 것이다.
        기본 행동이란 어떤 function에 대해 브라우저가 기본적으로 수행하는 동작이다.
        누군가 form을 submit하면 브라우저는 기본적으로 페이지를 새로고침 하도록 되어 있고,
        이 함수를 추가함으로써 그 기본 동작을 막을 수 있다.
    */
    loginForm.classList.add(HIDDEN_CLASSNAME);
    const username = loginInput.value;
    localStorage.setItem(USERNAME_KEY, username);
    console.log(loginInput.value);
    //greeting.innerHTML = "Hello " + username;
    //greeting.innerHTML = `Hello  ${username}`;
    //greeting.classList.remove(HIDDEN_CLASSNAME);
    paintGreetings(username);
}

//화면에 텍스트를 출력하는 함수
function paintGreetings(username) {
    greeting.innerHTML = `Hello  ${username}`;
    greeting.classList.remove(HIDDEN_CLASSNAME);
}


const savedUsername = localStorage.getItem(USERNAME_KEY);
if (savedUsername === null) {
    //show the form
    loginForm.classList.remove(HIDDEN_CLASSNAME);
    loginForm.addEventListener("submit", onLoginSubmit);
} else {
    //show the greeting
    paintGreetings(savedUsername);
}

/*
JS는 발생한 일에 대해 네가 필요로 할만한 정보를 주는 것이다.
onLoginSubmit({informantion})

모든 EventListener function의 첫 번째 argument는 항상 지금 막 벌어진 일들에 대한 정보가 될 것이다.
우리는 공간만 제공하면 되고 JS가 우리에게 정보를 무료로 제공한다.
방금 일어난 event에 대한 정보를 지닌 argument를 채워넣는다.


*/

/**
 * JS는 함수를 실행시키는 동시에 그 함수에 첫 번째 인자로 Object를 넣어 준다.
 */
function handleLinkClick(event) {
    //alert는 모든 동작을 막고, ok 버튼을 누르면 실행된다.
    console.log(event);
    event.preventDefault();
    alert("clicked!");

}

//const link = document.querySelector("a");
//JS에 함수의 이름만 주면 실행하는건 JS의 몫이다.
//link.addEventListener("click", handleLinkClick);
//방금 일어난 evnet에 대한 정보를 담은 이 object는
//handleLinkClick을 위한 EventListener 함수의 첫 번째 인자로 주어지게 된다.
//handleLinkClick({information about the event that just happened})