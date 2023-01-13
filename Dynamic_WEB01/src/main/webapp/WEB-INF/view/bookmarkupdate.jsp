<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.List,model.dto.BookmarkDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 수정 </title>
</head>
<body>
	<div>
	<!-- ./ 로하면 ./index.html로 인식한다. 그래서 이렇게쓰면안됨 
	bookmark/index.html-->
		<a href="../bookmark">돌아가기</a>
	</div>
	<h2>즐겨찾기</h2>
	<form action="./update" method="post">
		<div>
			<input type="hidden" name="id" value="<%=((BookmarkDTO)request.getAttribute("data")).getId()%>">
		</div>
		<div>
			<input type="text" name="url" value="<%=((BookmarkDTO)request.getAttribute("data")).getUrl()%>">
		</div>
		<div>
			<input type="text" name="name" value="<%=((BookmarkDTO)request.getAttribute("data")).getName()%>">
		</div>
		<div>
			<button type="submit">저장</button>
		</div>
	</form>




</body>
</html>