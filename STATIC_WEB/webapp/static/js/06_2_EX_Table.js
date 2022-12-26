cnt=1;
function addRow() {
    var form = document.forms[0];
    var tbody = document.getElementsByTagName('tbody')[0];

    var th1=document.createElement('th');
    th1.innerText=tbody.children.length+1;

    var th2=document.createElement('th');
    th2.innerText=form.title.value;

    var th3=document.createElement('th');
    th3.innerText=form.writer.value;

    var today =  new Date();
    var year = today.getFullYear();
    var month = ('0' + (today.getMonth() + 1)).slice(-2);
    var day = ('0' + today.getDate()).slice(-2);
    // console.log(('0' + today.getDate()).slice(-2))
    var dateString = year + '-' + month  + '-' + day;

    var th4=document.createElement('th');
    th4.innerText=dateString;

    var th5=document.createElement('th');
    th5.innerText=0
    
    var tr =document.createElement('tr');
    tr.append(th1); 
    tr.append(th2); 
    tr.append(th3); 
    tr.append(th4); 
    tr.append(th5);
    console.log(tr); 

    
    // var temp =document.getElementById('t1');
    // getbyID는 배열이아니라서 뒤에[0]붙이면 안된다.
    // console.log(temp);
    // temp.after(tr);

    tbody.append(tr);


// 방법2@@@@@@@@@@@@@@@@@@@@@@
    // let temp="";
    //     temp +="<th>" +(tbody.children.length+1)+"</th>"+"<th>" +form.title.value+"</th>"+"<th>" +form.writer.value+"</th>"+"<th>" +dateString+"</th>"+"<th>" +"0"+"</th>";

    // console.log(temp)
    // tbody.innerHTML+="<tr>" + temp +"</tr>";


}