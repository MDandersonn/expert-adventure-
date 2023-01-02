function addItem(form, targetId) {
    console.log(form);
    var target = document.getElementById(targetId);
    var li = document.createElement("li");
    li.innerText = form.item.value;
    form.item.value = "";

    if(form.location.value === "f") {
        target.prepend(li);
    } else if(form.location.value === "e") {
        target.append(li);
    }
}

function validCheck(form) {
    if(form.pass2.nextElementSibling !== null) {
        form.pass2.nextElementSibling.remove();
    }
    if(form.pass1.value !== form.pass2.value) {
        let span = document.createElement("span");
        span.innerText = "패스워드를 다시 확인하세요.";
        form.pass2.value = "";
        
        form.pass2.after(span);
        return false;
    }
}

function addRow(form) {
    var tbody = document.getElementById("table").lastElementChild;
    var now = new Date();

    var tr = createTableRow(5);
    tr.children[0].innerText = tbody.children.length + 1;
    tr.children[1].innerText = setAndClear(form.title);
    tr.children[2].innerText = setAndClear(form.writer);
    tr.children[3].innerText = [now.getFullYear(), (now.getMonth() + 1), now.getDate()].join("-");
    tr.children[4].innerText = 0;
    tbody.append(tr);
}

function setAndClear(inputElement) {
    var value = inputElement.value;
    inputElement.value = "";
    return value;
}

function createTableRow(columnCount) {
    var row = document.createElement("tr");
    for(let idx = 0; idx < columnCount; idx++) {
        let column = document.createElement("td");
        row.append(column);
    }
    return row;
}