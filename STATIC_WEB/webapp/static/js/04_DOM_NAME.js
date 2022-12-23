document.getElementsByName("username");
document.getElementsByName("username")[0];


// document.forms;
// document.forms[0];
// //위document.getElementsByName 방식을 쓰기보다 이렇게하면 폼을찾을수있따.
// var form = document.forms[0];
// form.username
// form.password

//form.password.value 하면 입력한 값을 알아낼 수 있음.



//form.chkHobby[0].value;
//form.chkHobby[1].checked;

var form0 = document.forms[0];
for(let item of form0.chkHobby){
    if(item.checked){
        console.log(item.value)
    }
}

// 방법1 :  <form action="server.jsp" onsubmit="return validCheck();">을쓰고
//함수의 매개변수를 안쓰고 함수안의 form이  var form = document.forms[0];의 form으로 인식하는법


// 방법2 : <form action="server.jsp" onsubmit="return validCheck(this);">을 쓰고
// 함수의 매개변수를 form이라고 주고 함수안의 form이 매개변수로 인식되게 하는법


function validCheck(form){
    // 유효성검사후 문제가 발생하면 false를 반환하여 서버에 전송이 안되게 할 것
    // 사용자가 입력한 두개의 패스워드가 동일할때만 서버에 전송이 되도록한다.
    // 두개의 패스워드가 동일하지 않은 경우 서버에 데이터를 전송하지 않고 
    // 추가로 패스워드 확인 옆에 패스워드를 다시 확인하시오"라는 메시지가 출력될 수 있도록 한다.
    if(form.password.value ===form.passwordcheck.value){
        return true;
    }else{
        var result= document.getElementById("r1");
        result.innerText="패스워드를 다시 확인하시오";
        form.passwordcheck.value="";
       return false;
    }
    

}
console.log(form.password.value)
console.log(form.passwordcheck.value)