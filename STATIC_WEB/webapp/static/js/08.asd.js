//이벤트 등록 및 이벤트 종류
var input = document.getElementsByTagName("input")[0];
// input.onclick= "익명함수/화살표함수/함수명 (단,소괄호없어야함)"

input.onclick= function(){
    console.log("익명함수작동");
};

// 위에꺼랑  중복안되고 덮어쓰기됨
input.onclick=()=> {
    console.log("화살표함수등록");
};

//
function fname(){
    console.log("일반함수");
}
// input.onclick=fname;

// input.addEventListener("click" , 익명함수/화살표함수/함수명);

// 이건 중복적용이가능
input.addEventListener("click", function(){
    console.log("addEventListener익명함수");
})

input.addEventListener("click", ()=>{
    console.log("addEventListener화살표함수");
})
input.addEventListener("click", fname);
input.removeEventListener("click",fname);

// 한번실행하고 지워짐
input.addEventListener("click",function func(){
    console.log("클릭이벤트(한번만 작동됩니다.");
    input.removeEventListener("click",func)
})

var input1 = document.getElementsByTagName("input")[1];

input1.addEventListener("dblclick",run)

function run(){
    console.log("더블클릭이벤트");
    input.removeEventListener("dblclick",run);
}


var input2 = document.getElementsByTagName("input")[2];
// 입력하고 엔터키눌럿을때 (기존값이 새로운값으로바뀌었을때)
input2.addEventListener("change",run2);

function run2(){
    console.log("change 이벤트발생");
    
}

// 입력할때

function run3(){
    console.log("input 이벤트발생");
    
}
var input3 = document.getElementsByTagName("input")[3];
input3.addEventListener("input",run3);

function run4(){
    console.log("focus이벤트발생");
    
}
//포커스되었을때
var input4 = document.getElementsByTagName("input")[4];
input4.addEventListener("focus",run4);

function run5(){
    console.log("blur 이벤트발생");
    
}

// 포커스상황에서 빠져나왔을때
input3.addEventListener("blur",run5);


function run6(){
    console.log("mouseenter 이벤트발생");
    
}
// 등록한요소에 마우스가 진입했을때
input2.addEventListener("mouseenter",run6);


function run7(){
    console.log("mouseleave이벤트발생");
    
}

// 등록한요소에 마우스가 진입하고 떠날때
input1.addEventListener("mouseleave",run7);

var div=document.getElementsByTagName("div")[0];
div.addEventListener("mouseenter",run6);
div.addEventListener("mouseleave",run7);

function run8(e){
    console.log(e.target);
    console.log(e)
}
input.addEventListener("click",run8);



// var form = document.forms[0];
var form = document.querySelector('form');
form.username.addEventListener("input", function(){
    if(form.username.value.length<6 || form.username.value.length>12){
        form.username.style.borderColor="red";
        form.username.style.borderStyle="solid";
        form.username.style.borderWidth="3px";
        if(form.username.nextElementSibling !== null) {
            form.username.nextElementSibling.remove();
        }
        let span = document.createElement("span");
        span.innerText = "아이디는 6자리 이상 12자리이하 입력해야 합니다.";
        span.style.color = "red";
        /* form.username.className = "input-error"; */
        form.username.classList.add("input-error");
        form.username.after(span);
    }else{
        if(form.username.nextElementSibling !== null) {
            form.username.nextElementSibling.remove();
        }
        form.username.style.borderColor="green";
        form.username.style.borderStyle="solid";
        form.username.style.borderWidth="3px";
    }
})

form.pass1.addEventListener("input", function(){
    if(form.pass1.value.length<4 || form.pass1.value.length>12){
        form.pass1.style.borderColor="red";
        form.pass1.style.borderStyle="solid";
        form.pass1.style.borderWidth="3px";
        if(form.pass1.nextElementSibling !== null) {
            form.pass1.nextElementSibling.remove();
        }
        let span = document.createElement("span");
        span.innerText = "비밀번호는 4자리 이상 12자리이하 입력해야 합니다.";
        span.style.color = "red";
        /* form.pass1.className = "input-error"; */
        form.pass1.classList.add("input-error");
        form.pass1.after(span);
    }else{
        if(form.pass1.nextElementSibling !== null) {
            form.pass1.nextElementSibling.remove();
        }
        form.pass1.style.borderColor="green";
        form.pass1.style.borderStyle="solid";
        form.pass1.style.borderWidth="3px";
    }
})


form.pass2.addEventListener("input", function(){
    if(form.pass1.value !== form.pass2.value){
        form.pass2.style.borderColor="red";
        form.pass2.style.borderStyle="solid";
        form.pass2.style.borderWidth="3px";
        if(form.pass2.nextElementSibling !== null) {
            form.pass2.nextElementSibling.remove();
        }
        let span = document.createElement("span");
        span.innerText = "비밀번호가 일치하지 않습니다..";
        span.style.color = "red";
        /* form.pass2.className = "input-error"; */
        form.pass2.classList.add("input-error");
        form.pass2.after(span);
    }else{
        if(form.pass2.nextElementSibling !== null) {
            form.pass2.nextElementSibling.remove();
        }
        form.pass2.style.borderColor="green";
        form.pass2.style.borderStyle="solid";
        form.pass2.style.borderWidth="3px";
    }
})
form.username.addEventListener("input",usernameValid);
function usernameValid(e){
    // 이벤트발생객체가 매개변수로 전달된다.
    console.log(e);
    console.log(e.target);
    var username1=e.target;
    //e.target는 form.username이다.
    console.log(username1)//name이 username인 태그를가져옴
    console.log(username1.value);
}


function validCheck(form) {
    var isValid = true;
    if(form.username.nextElementSibling !== null) {
        form.username.nextElementSibling.remove();
    }
    if(form.username.value.length < 6) {
        let span = document.createElement("span");
        span.innerText = "아이디는 6자리 이상 입력해야 합니다.";
        span.style.color = "red";
        /* form.username.className = "input-error"; */
        form.username.classList.add("input-error");
        form.username.after(span);
        isValid = false;
    }
    if(form.pass1.nextElementSibling !== null) {
        form.pass1.nextElementSibling.remove();
    }
    if(form.pass1.value.length < 4) {
        let span = document.createElement("span");
        span.innerText = "패스워드는 4자리 이상 입력해야 합니다.";
        span.style.color = "red";
        /* form.pass1.style.borderColor = "red"; */
        /* form.pass1.className = "input-error"; */
        form.pass1.classList.add("input-error");
        form.pass1.after(span);
        isValid = false;
    }
    if(form.pass2.nextElementSibling !== null) {
        form.pass2.nextElementSibling.remove();
    }
    if(form.pass1.value !== form.pass2.value) {
        let span = document.createElement("span");
        span.innerText = "패스워드를 다시 확인하세요.";
        span.style.color = "red";
        /* form.pass2.style.borderColor = "red"; */
        /* form.pass2.className = "input-error"; */
        form.pass2.classList.add("input-error");
        form.pass2.after(span);
        isValid = false;
    }
    return isValid;
}