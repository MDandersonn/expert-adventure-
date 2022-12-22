/*
DOM (document object model)

특정 요소를 가져오기위한 기능이 몇가지있다.
*/

// id속성의 값을 사용하여 엘리먼트를 가져오기 위한 메서드
document.getElementById;

//name 속성의 값을 사용하여 여러 엘리먼트를 가져오기 위한 메서드
document.getElementsByName;

// 태그명을 사용하여 여러 엘리먼트를 가져오기 위한 메서드
document.getElementsByTagName;

// 클래스 속성의 값을 사용하여 여러 엘리먼트를 가져오기 위한 메서드
document.getElementsByClassName;


document.getElementById("programList");
document.getElementsByName("oracle"); 
document.getElementsByTagName("ul");
document.getElementsByClassName("menu-item");

// 함수로 감싸야만 작동한다. script불러오는 순서떄문.
function my(){
// var result1 =document.getElementById("r1");
var result1 = document.getElementById("programList");
// result1.innerHTML="<h1> hello </h1>";
console.log(result1)
}




// css에서 사용하는 선택자를 이용하여 하나의 엘리먼트를 가져오기 위한 메서드
document.querySelector("#programList")


// css에서 사용하는 선택자를 이용하여 여러 엘리먼트를 가져오기 위한 메서드

document.querySelectorAll("ul,li");


//
var items1= document.getElementsByClassName("menu-item");
// items[0]
// items[1] 이렇게 선택가능 items[2].innerText; 로 입력가능
for(let item of items1){
    console.log(item.innerText);
}


function toUpper(){
    var items =document.querySelectorAll("li");
    for(let item of items){
        item.innerText=item.innerText.toUpperCase();
    }

}

// function toLower(){
//     var items =document.querySelectorAll("li");
//     for(let item of items){
//         item.innerText=item.innerText.toLowerCase();
//     }

// }

function toLower(){
    var items =document.querySelectorAll("li");
    for(let item of items){
        toUpperLower(item,"lower");
    }
}

// upper라는 기본값설정
function toUpperLower(element,caseType="upper"){
    var text=element.innerText;
    element.innerText=caseType=== "upper" ? text.toUppercase(): text.toLowerCase();
}