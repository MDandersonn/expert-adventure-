<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, model.dto.VisitDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="../visit">돌아가기</a>
	</div>
	
	
	<form action="./update" method="post">
		<div>
		<input type="hidden" name="id" value="<%=((VisitDTO)request.getAttribute("data")).getId()%>">
		</div>
		<div>
		<input type="text" name="nickname" value="<%=((VisitDTO)request.getAttribute("data")).getNickname()%>">
		</div>
		<div>
		<textarea rows="3" cols="25" name="context"><%=((VisitDTO)request.getAttribute("data")).getContext()%></textarea>
		</div>
		<div>
		<input type="submit">저장
		</div>
	</form>

</body>
</html>