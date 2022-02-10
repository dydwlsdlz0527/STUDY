const images = [
    "0.jpg",
    "1.jpg",
    "2.jpg"
];

const backgroundImage = images[Math.floor(Math.random()*images.length)];

const bgImage = document.createElement("img");

bgImage.src = `img/${backgroundImage}`;
/**
 * appendChild는 제일 뒤에, prepend는 제일 앞에 위치 시킨다.
 */
document.body.appendChild(bgImage);
//document.body.prepend(bgImage);