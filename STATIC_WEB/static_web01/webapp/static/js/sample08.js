/**
 * 실시간 검사
 *     아이디는 6 ~ 12 자 사이의 값을 입력하였는지 실시간으로 검사하여 문제가 있는 경우
 *     붉은색 테두리와 에러 메시지로 사용자에게 즉시 알릴 수 있도록 하고, 정상 입력인
 *     경우 초록색 테두리와 정상 메시지로 사용자에게 알릴 수 있도록 한다.
 * 
 *     패스워드는 4 ~ 12자 사이의 값을 입력하였는지 실시간으로 검사하여 위의 아이디와
 *     동일한 처리를 하도록 한다.
 * 
 *     패스워드 확인은 기존에 입력한 패스워드와 동일한 값 인지를 실시간으로 검사하여 위의
 *     아이디와 동일한 처리를 하도록 한다.
 */
window.onload = function() {
    var form = document.forms[0];
    form.username.addEventListener("input", function(e) { lengthValid(e, 6, 12); });
    form.pass1.addEventListener("input", function(e) { lengthValid(e, 4, 12); });
    form.pass2.addEventListener("input", function(e) { lengthValid(e, 4, 12); });
    form.pass1.addEventListener("change", function(e) { equalValue(e, form.pass2) });
    form.pass2.addEventListener("change", function(e) { equalValue(e, form.pass1) });
}

function lengthValid(event, min, max) {
    var inputElement = event.target;
    if(inputElement.value.length >= min && inputElement.value.length <= max) {
        inputElement.style.borderColor = "green";
        inputElement.style.borderWidth = "5px";
    } else {
        inputElement.style.borderColor = "red";
        inputElement.style.borderWidth = "5px";
    }
}

function equalValue(event, other) {
    var inputElement = event.target;
    if(inputElement.value === other.value) {
        inputElement.style.borderColor = "green";
        inputElement.style.borderWidth = "5px";
        other.style.borderColor = "green";
        other.style.borderWidth = "5px";
    } else {
        inputElement.style.borderColor = "red";
        inputElement.style.borderWidth = "5px";
        other.style.borderColor = "red";
        other.style.borderWidth = "5px";
    }
}

function usernameValid(e) {
    var username = e.target;
    if(username.value.length >= 6 && username.value.length <= 12) {
        username.style.borderColor = "green";
        username.style.borderWidth = "5px";
    } else {
        username.style.borderColor = "red";
        username.style.borderWidth = "5px";
    }
}
