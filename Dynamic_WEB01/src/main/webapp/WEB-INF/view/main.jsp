<!-- 지시자 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Random"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%!
	//선언부
	public Random rand= new Random();
	public int getNumber(){
		return rand.nextInt(10);
	}
	//주석되네  HTML코드랑 자바코드랑 섞여서들어가는데 이걸 JSP(자바서버페이지)라고한다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSP파일(main.jsp)이 실행되었습니다.dd</h2>
	<form action="./main">
	<!--메서드 안쓰면 기본이 get방식  -->
	<!--다시 또 메인 호출  -->
		<input type="number" name="num">
		<!--number라고해서 이게 타입이 넘버가아니다 숫자양식을 입력하는거지 문자열이다.-->
		<!--서버에데이터를 전송해서 서버에서받아서 처리하게 만들게  -->
		
		<button type="submit">전송</button>
	</form>
	<h2><%=(Integer)request.getAttribute("number") %> 숫자타입</h2>
	<h2><%=request.getParameter("num") %> 문자타입</h2>
	<!-- jsp에서도 리퀘스트객체를쓸수있당 왜냐면 서블릿에서 리퀘스트겍체를 넘겨줬으니까. -->
	
	
	<ul>
	<!--  스크립트릿-->
	<% for(int i=getNumber();i>=0;i--){ %>
		<li><%=i %></li><!--  표현식-->
	<%}%>
	</ul>
	
	
	
	<h3>EL-expression language</h3>
	<!--EL 오류원래못잡는다 무시해도된다.  -->
	<%="값" %> -> ${"값"}
	<br>
	${10+20 }<br>
	${10 div 3} <br>
	
	<!--  10%3-->
	${10 mod 3} <br>
	${10 eq 10} <br>
	${11 ne 10} <br>
	${20 gt 10} <br>
	${10 ge 10} <br>
	${5 lt 10} <br>
	${true and true} <br>
	${true or true} <br>
	${not true} <br>
	
	<!--  null또는 빈문자열일때-->
	${empty x} <br>
	<!--  3항연산-->
	${empty x ? "없음":"있음" }<br>
	<%-- ${"문자열"+ "문자열" }<br> 숫자랑 문자열합한것도 에러남  그냥 붙여서 아래처럼쓰면됨--%>
	${"문자열"}${"문자열"}
	
	<h4>EL 로 request.getAttribute()사용</h4>
	${requestScope.number} <br>
	
	<h4> EL로 request.getParameter()사용 </h4>
	${param.num } <br>
		
	
</body>
</html>