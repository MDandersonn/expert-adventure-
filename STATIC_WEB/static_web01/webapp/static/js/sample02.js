function createList() {
    var result = document.getElementById("result1");
    var itemList = getItems();

    var liTags = "";
    for(let item of itemList) {
        liTags += "<li>" + item  + "</li>";
    }
    result.innerHTML = "<ul>" + liTags + "</ul>";
}

function getItems() {
    var input = prompt("쉼표를 구분문자로 사용하여 태그명을 작성하세요.");
    return input.split(",");
}


function createMonth() {
    var result = document.getElementById("result2");
    var now = new Date();
    var currentMonth = now.getMonth();

    var optionTags = "";
    for(let m = 1; m <= 12; m++) {
        optionTags += m === currentMonth + 1 ? "<option selected>" : "<option>";
        optionTags += m + "월</option>";
    }
    result.innerHTML = "<select>" + optionTags + "</select>";
}
