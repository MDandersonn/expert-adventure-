<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.List, model.dto.VisitDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>visit</title>
</head>
<body>
	<div>
		<a href="./">메인으로</a>
	</div>
	<h2>방명록</h2>
	<form action="./visit" method="post">
		<div>
			<input type="text" name="nickname">
		</div>
		<div>
			<textarea rows="3" cols="25" name="context"></textarea>
		</div>
		<div>
			<button type="submit">저장</button>
		</div>
	</form>
	<ul>
		<%for(VisitDTO d: (List<VisitDTO>)request.getAttribute("data") ){ %>
			<li><%=d.getNickname() %> | <%=d.getContext() %></li>
		<%} %>
	</ul>
<!-- 
./ 는   ./index.jsp or index.html  이 생략된것. (web.xml 웰컴 파일 리스트 때문)

뒤에슬래시가 붙으면 폴더고 슬래시가 못붙으면 페이지
페이지는 현재폴더로 치지않는다.  http://localhost:8080/web01/visit 의 visit는 페이지고
현재경로는 web01 인거 
http://localhost:8080/web01/visit/add 는 현재경로는 visit이고 페이지는 add

http://localhost:8080/web01/ 이건 맨마지막에/ 가 붙을수있으니까 폴더지.
./로 인식이 가능함.
-->


</body>
</html>