<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세션 테스트</h1>
<%
	String name = null;
	
	Enumeration<String> ses = session.getAttributeNames();
	
	while(ses.hasMoreElements()) {
		name = (String)ses.nextElement();
		if(name != null) {
%>

	<h2>세션 값 : <%=name %></h2>

<%
		}
	}
	/* if(session.getAttribute("name")!=null) {
	// session에 담긴 값은 어떤 값이 올지 알 수 없으므로 object로 처리가 된다.
	// 따라서 형 변환 필요
		name = (String)session.getAttribute("name");
	} else {
		name = "세션 값 없음";
	}*/ 
	
	
%>    
	<button onclick="location.href='sessionSet.jsp'">세션 값 저장</button>
	<button onclick="location.href='sessionDel.jsp'">세션 값 삭제</button>
	<button onclick="location.href='sessionInvalidate.jsp'">세션 값 초기화</button>
</body>
</html>