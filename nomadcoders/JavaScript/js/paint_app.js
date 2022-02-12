const canvas = document.getElementById("jsCanvas");
// 안의 pixel을 컨트롤
const ctx = canvas.getContext("2d");
//getElementsByClassNamee대신 querySelectorAll을 사용해도 된다.
//querySelect의 경우 맨 처음 하나의 요소만 선택한다.
const colors = document.getElementsByClassName("jsColor");
const range = document.querySelector("#jsRange");
const mode = document.querySelector("#jsMode");
const saveBtn = document.querySelector("#jsSave");
const INITIAL_COLOR = "#2c2c2c";
const CANVAS_SIZE = 700;

canvas.width = canvas.offsetWidth;
canvas.heigh = canvas.offsetHeight;


/**
 *  canvas를 pixel을 다룰 수 있는 element를 만들기 때문에
 *  이 element에 width와 heigh를 줘야 한다.
 */
canvas.width = CANVAS_SIZE;
canvas.heigh = CANVAS_SIZE;


ctx.fillStyle = "white";
ctx.fillRect(0,0,CANVAS_SIZE,CANVAS_SIZE);
ctx.strokeStyle = INITIAL_COLOR;
//lineWith는 선의 두께를 조절한다.
//canvas 안의 픽셀을 다룬다.
ctx.lineWidth = 2.5;
ctx.fillStyle = INITIAL_COLOR;

let painting=false;
let filling = false;

function stopPainting(){
    painting = false;
}

function startPating(){
    painting = true;
}

function onMouseMove(event){
    const x = event.offsetX;
    const y = event.offsetY;
    if(!painting){
        //경로 생성
        ctx.beginPath();
        //선 시작 좌표
        ctx.moveTo(x,y);
    }else{
        //선 끝 좌표
        ctx.lineTo(x,y);
        //선 그리기
        ctx.stroke();
    }
}

function handleColorClick(event){
    console.log(event.target.style);
    const color = event.target.style.backgroundColor;
    ctx.strokeStyle = color;
    ctx.fillStyle = color;
}

function handleRangeChange(event){
    const size = event.target.value;
    ctx.lineWidth = size;
}

function handleModeClick(){
    if(filling===true){
        filling = false;
        mode.innerHTML = "Fill";
    }else{
        filling = true;
        mode.innerHTML = "Paint";
        
    }
}

function handleCanvasClick(){
    if(filling){
        ctx.fillRect(0,0,CANVAS_SIZE,CANVAS_SIZE);
    }   
}

function handleCM(event){
    event.preventDefault();
}

function handleSaveClick(){
    const image = canvas.toDataURL();
    const link = document.createElement("a");
    link.href = image;
    link.download = "PaintJS[EXPORT]";
    link.click();
}

if(canvas){
    canvas.addEventListener("mousemove", onMouseMove);
    //mousedown은 클릭했을 때 발생하는 event
    canvas.addEventListener("mousedown", startPating);
    canvas.addEventListener("mouseup", stopPainting);
    canvas.addEventListener("mouseleave",stopPainting);
    canvas.addEventListener("click",handleCanvasClick);
    canvas.addEventListener("contextmenu",handleCM);
}

//Array.from 메소드는 object로부터 array를 만든다.
if(colors){
    Array.from(colors).forEach(color => color.addEventListener("click",handleColorClick));
}

if(range){
    range.addEventListener("input", handleRangeChange);
}
if(mode){
    mode.addEventListener("click", handleModeClick);
}
if(saveBtn){
    saveBtn.addEventListener("click",handleSaveClick)
}