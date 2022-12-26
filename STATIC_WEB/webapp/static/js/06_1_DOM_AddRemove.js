// 엘리먼트 추가
var ul = document.getElementsByTagName("ul")[0];

var li = document.createElement("li");
li.innerText="새로운 목록추가";
console.log(li);

// 마지막자식으로 추가
ul.append(li);


// 첫번째자식으로추가
var li = document.createElement("li");
li.innerText="다시 목록추가";
ul.prepend(li);


var base = ul.children[1]; // 목록1선택
var li = document.createElement("li");
li.innerText="목록2";
base.after(li);//목록1을 기준으로해서 뒤에 추가


var li = document.createElement("li");
li.innerText="목록0";
base.before(li);//목록1을 기준으로 앞에 추가.

/*
prepend append는 자식으로추가하는거고
before after는 형제로 추가하는거고.
*/

// 제거
ul.lastElementChild.remove();
console.log(document.getElementsByTagName("input")[0]);

// var form= document.forms[0];
// console.log(form.item.value)

// function addItem(){
    
//     var form = document.forms[0];
//     var li = document.createElement("li");
//     li.innerText=form.item.value;

//     var ul = document.getElementsByTagName("ul")[0];
//     ul.append(li);
// }

function addItem(){
    
    var form = document.forms[0];
    var li = document.createElement("li");
    li.innerText=form.item.value;

    var ul = document.getElementsByTagName("ul")[0];
    var base = document.getElementById("r0");// 목록1선택
    if (form.item2.value==='f'){
        base.before(li);
    }else{
        base.after(li);
    }
    
}




function validCheck(form){
    // 유효성검사후 문제가 발생하면 false를 반환하여 서버에 전송이 안되게 할 것
    // 사용자가 입력한 두개의 패스워드가 동일할때만 서버에 전송이 되도록한다.
    // 두개의 패스워드가 동일하지 않은 경우 서버에 데이터를 전송하지 않고 
    // 추가로 패스워드 확인 옆에 패스워드를 다시 확인하시오"라는 메시지가 출력될 수 있도록 한다.
    if(form.password.value ===form.passwordcheck.value){
        return true;
    }else{
        // console.log("hihih");
        // var form1 =document.forms[1];
        var span = document.createElement("span");        
        span.innerText="패스워드를 다시 확인하시오";
        // var form1 =document.getElementsByTagName("[1];
         var base= document.getElementsByTagName('form')[1];
         console.log(base);

         var base3= base.children[0];
         console.log(base3);

        var base4= base.getElementsByTagName('input')[1];
        console.log(base4)

        // abc로 자동완성뜨는 ByName이나 ByID는 불가능하다.
        // var base5= base.getElementsByTagName()
        // console.log(base5)

         var base2= document.getElementsByName('passwordcheck')[0];
         console.log(base2);
         base2.after(span);
         form.passwordcheck.value="";
       return false;
    }
}
// console.log(form.password.value)
// console.log(form.passwordcheck.value)

// ul.lastElementChild.remove();
function validCheck2(form){
    if(form.password.value !== form.passwordcheck.value){
        if(form.passwordcheck.nextElementSibling !==null){
            form.passwordcheck.nextElementSibling.remove();
        };
        let span=document.createElement("span");
        span.innerText= "패스워드를 다시 확인하세요.";
        form.passwordcheck.value="";
        form.passwordcheck.after(span);
        return false;
    }
}