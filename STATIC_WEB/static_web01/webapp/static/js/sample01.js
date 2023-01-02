console.log("스트립트 파일 실행 확인!");

/* 매개변수 없는 함수 */
function fn1() {
    document.getElementById("result1").innerText = "함수 실행 완료!!";
}

/* 매개변수 있는 함수 */
function fn2(x, y) {
    if(y === undefined) {
        y = 0;
    }
    var res = x + y;
    document.getElementById("result1").innerText = "x + y = " + res;
}

/* 매개변수에 기본값을 설정한 함수 */
function fn3(x, y=0) {
    var res = x + y;
    document.getElementById("result1").innerText = "x + y = " + res;
}

/* 가변 매개변수 함수 : 매개변수의 수가 0개 이상이 사용될 수 있는 함수 */
function fn4(...x) {
    console.log(x);
    document.getElementById("result1").innerText = x;
}

/* 익명 함수: 함수를 만들때 함수의 이름 없이 만들어서 사용하는 함수 */
var fn5 = function() {
    document.getElementById("result1").innerText = "익명함수 실행!";
    // return 0;  필요하면 return 사용 할 것
}

/* 화살표 함수: 익명 함수를 더 간단하게 만들어서 사용하는 함수 */
var fn6 = () => {
    document.getElementById("result1").innerText = "화살표 함수 실행!";
}