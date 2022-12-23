function createList(){
    
    var result= document.getElementById("result1");
    console.log(result)
    const arr1= getItems();
    
    let temp="";
    for( let x of arr1){
        temp +="<li>" +x+"</li>";

    }
    console.log(temp)
    result.innerHTML="<ul>" + temp +"</ul>";
}
function getItems(){
    var input =prompt("쉼표를 구분문자로 사용하여 태그명을 작성하세요.");
    return input.split(",");
}

function createMonth(){
    // 현재날짜
    var now =  new Date();
    // 월
    var currentMonth= now.getMonth();
    console.log(currentMonth+1)
    var result= document.getElementById("result2");
    let temp="";
    for(var a=1; a<=12; a++){

        temp += a===currentMonth+1 ? "<option selected>" : "<option>";
        temp += a+"월</option>";
        // if (currentMonth+1===a){
        //     temp += "<option selected>" + a+"월</option>";
        // }else{
        //     temp += "<option>" + a+"월</option>";
        // }

    }
    result.innerHTML="<select>" +temp +"</select>"
    console.log(result.innerHTML)

}