document.getElementsByName("username");
document.getElementsByName("username")[0];


// document.forms;
// document.forms[0];
// //위document.getElementsByName 방식을 쓰기보다 이렇게하면 폼을찾을수있따.
var form = document.forms[0];
// form.username
// form.password

//form.password.value 하면 입력한 값을 알아낼 수 있음.



//form.chkHobby[0].value;
//form.chkHobby[1].checked;
for(let item of form.chkHobby){
    if(item.checked){
        console.log(item.value)
    }
}