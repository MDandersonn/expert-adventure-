// window.onload=function name() {
//     alert("HELLO~");  
// };


console.log("스크립트파일실행");
function fn1(x){
    console.log(x+"함수실행완료")
    return x;
}
function fn2(){
    document.getElementById("result1").innerText="함수실행완룡!";
}

// 기본매개변수 사용
function fn3(x,y=0){
    var res=x+y;
    document.getElementById("result1").innerText= res;
}

// if문으로 기본매개변수사용
function fn3_1(x,y){
    if (y===undefined){
        y=0;
    }
    var res=x+y;
    document.getElementById("result1").innerText= res;
}
// 가변매개변수 함수
function fn4(...x){
    document.getElementById("result1").innerText=x;
}

// 익명함수: 함수를 만들때 함수의 이름없이 만들어서 사용하는 함수
var fn5 = function(){
    document.getElementById("result1").innerText="익명함수 실행";
}

// 화살표함수:익명함수를 더 간단하게 만들어서 사용하는 함수 function이 빠지고 화살표가 붙음
var fn6= ()=>{
    document.getElementById("result1").innerText="화살표 함수 실행";
}