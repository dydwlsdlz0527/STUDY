const toDoForm = document.getElementById("todo-form");
const toDoInput = toDoForm.querySelector("#todo-form input");
const toDoList = document. getElementById("todo-list");

const TODOS_KEY = "todds";

//const toDos = [];
let toDos = [];

function saveToDos(){
    localStorage.setItem(TODOS_KEY,JSON.stringify(toDos));
}

/**
 * 
 * @param {*} event 
 * 모든 HTML element에는 하나 이상의 property가 존재한다.
 */
function deleteToDo(event){
    const li = event.target.parentElement;
    //Type이 같아야 한다.
    toDos = toDos.filter((toDo) => toDo.id !== parseInt(li.id));
    console.log(toDos);
    li.remove();
    saveToDos();
}

function paintToDo(newTodo){
    const li = document.createElement("li");
    li.id = newTodo.id;
    const span = document.createElement("span");
    const button = document.createElement("button");
    span.innerHTML = newTodo.text;
    button.innerHTML = "❌";
    button.addEventListener("click",deleteToDo);
    li.appendChild(span);
    li.appendChild(button);
    toDoList.appendChild(li);
}

function handleToDoSubmit(event){
    event.preventDefault();
    const newTodo = toDoInput.value;
    toDoInput.value="";
    const newTodoObj = {
        text: newTodo,
        id: Date.now(),
    };
    toDos.push(newTodoObj);
    paintToDo(newTodoObj);
    saveToDos();
}

toDoForm.addEventListener("submit",handleToDoSubmit);

function sayHello(item){
    console.log("this is the turn of ",item);
}

const savedToDos = localStorage.getItem(TODOS_KEY);
/**
 * JS는 array에 있는 각각의 item에 대해 function을 실행할 수 있게 해준다.
 */
if(savedToDos!==null){
    const parsedToDos = JSON.parse(savedToDos);
    toDos = parsedToDos;
    //console.log(parsedToDos);
    //parsedToDos.forEach((item) => console.log("this is the turn of ", item));
    //parsedToDos.forEach(sayHello);
    /**
     * paintToDo에 array의 item을 넣어준다.
     */
    parsedToDos.forEach(paintToDo);
}

/**
 * function TestFilter(){return true}
 * true이면 배열 유지, false면 사라진다. 
 * [1,2,3,].filter(TestFilter);
 * TestFilter(1);
 * TestFilter(2);
 * TestFilter(3);
 */




