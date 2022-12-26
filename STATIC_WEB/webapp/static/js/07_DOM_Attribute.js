var div=document.createElement("div");
div.innerText="div영역";
document.body.append(div);

//style 적용하기

div.style.color="red";
div.style.backgroundColor="gray";


//속성추가하기.
div.id="id_div";
console.log(div);

// 클래스부여
div.className="class-name";
console.log(div);

// 클래스 추가 add는 같은이름이있으면 더추가안함.
div.classList.add("add-class");
console.log(div);

//클래스 삭제
div.classList.remove("class-name");
console.log(div);

// toggle이란 클래스가 없으면 들어가고 있으면 삭제시키고.
div.classList.toggle("class-name");

//input태그의 속성추가하기.
var input = document.createElement("input");
document.body.append(input);
input.type='text';
input.type='password';
console.log(input);


//require추가시키기
input.required=true;
console.log(input);

//없는속성은 추가가안됨
input.x="1";
console.log(input);

//강제로 무의미한 속성추가시키기
input.setAttribute("x","1");
console.log(input);

//속성값 가져오기
console.log(input.getAttribute("x"));

console.log(1000);
let input1=document.querySelectorAll(".form-control");
console.log(input1);

function validCheck2(form){
    console.log(form.username.value.length);
    if(form.username.value.length<6){
        if(form.username.nextElementSibling !==null){
            form.username.nextElementSibling.remove();
        };
        if(form.password.nextElementSibling !==null){
            form.password.nextElementSibling.remove();
        };
        if(form.passwordcheck.nextElementSibling !==null){
            form.passwordcheck.nextElementSibling.remove();
        };

        let inputList=document.querySelectorAll(".form-control");
        for(let i=0; i<inputList.length; i++){
            inputList[i].style.borderColor='red';
        }

        let span=document.createElement("span");
        span.innerText= "아이디를 6자 이상으로 입력하세요.";
        form.username.style.borderColor='blue';
        span.style.color='red';
        form.username.value="";
        form.password.value="";
        form.passwordcheck.value="";
        form.username.after(span);
        return false;
    }
    else if(form.password.value.length <4){
        if(form.username.nextElementSibling !==null){
            form.username.nextElementSibling.remove();
        };
        if(form.password.nextElementSibling !==null){
            form.password.nextElementSibling.remove();
        };
        if(form.passwordcheck.nextElementSibling !==null){
            form.passwordcheck.nextElementSibling.remove();
        };

        let inputList=document.querySelectorAll(".form-control");
        for(let i=0; i<inputList.length; i++){
            inputList[i].style.borderColor='red';
        }
        let span=document.createElement("span");
        span.innerText= "패스워드를 4자리 이상입력하세요";
        span.style.color='red';
        form.password.style.borderColor='blue';
        form.username.value="";
        form.password.value="";
        form.passwordcheck.value="";
        form.password.after(span);
        return false;
    }
    else if(form.password.value !== form.passwordcheck.value){
        
        if(form.username.nextElementSibling !==null){
            form.username.nextElementSibling.remove();
        };
        if(form.password.nextElementSibling !==null){
            form.password.nextElementSibling.remove();
        };
        if(form.passwordcheck.nextElementSibling !==null){
            form.passwordcheck.nextElementSibling.remove();
        };
        // let input1=document.querySelectorAll("div>input");
        // console.log(input1);
        // 아래와 같이하면안된다 input1은 배열이기때문에. for문돌려야함
        // input1.style.color='red';

        let inputList=document.querySelectorAll(".form-control");
        for(let i=0; i<inputList.length; i++){
            inputList[i].style.borderColor='red';
        }
        let span=document.createElement("span");
        span.innerText= "패스워드를 다시 확인하세요.";
        span.style.color='red';
        form.passwordcheck.style.borderColor='blue';
        form.username.value="";
        form.password.value="";
        form.passwordcheck.value="";
        form.passwordcheck.after(span);
        return false;
    }

    console.log(document.body);
}
