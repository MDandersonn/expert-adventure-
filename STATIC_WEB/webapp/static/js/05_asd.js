//부모자식관계 형제관계를 이용하여 엘리먼트에 접근하기.

var table= document.getElementsByTagName("table")[0];
console.log(table);

var thead =table.getElementsByTagName("thead")[0];
console.log(thead);

console.log(thead.getElementsByTagName("th"));

// children으로 자식까지만 접근가능.
console.log(thead.children[0].children);

var tr= thead.children[0];

// 첫번째자식
console.log(tr.firstElementChild)

var th= tr.lastElementChild;
// 마지막자식
console.log(tr.lastElementChild)

// 부모
console.log(th.parentElement);

// 부모의부모
console.log(th.parentElement.parentElement);

// 이전요소
console.log(th.previousElementSibling);

// 다음요소 (없으면 null로나옴)
console.log(th.nextElementSibling);


console.log(th.previousElementSibling.nextElementSibling);


/*   
#주의 .앞에는 엘리먼트객체가 와야한다.
자식에게 접근
.children
.firstElementChild
.lastElementChild

부모에게접근  .parent

인접형제에게 접근
.previousElementSibiling
.nextElementSibling
*/

function counting(element){
    // tr태그영역 클릭되면 조회수+1
    // alert("tr클릭감지");
    var jo = element.lastElementChild;
    console.log(jo.innerText)
    console.log(Number(jo.innerText) +1);
   jo.innerText=Number(jo.innerText) +1;

}
