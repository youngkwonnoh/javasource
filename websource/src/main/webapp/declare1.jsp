<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	private String getStr() {
		return str + "테스트";
	}
	private String str="선언문";
%>
<%
	// _jspService() 메소드 안에 삽입됨
	
	// public void print(){}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp 선언문</h1>
	<%-- out.print(getStr()); --%>
	<h3><%=getStr()%></h3>
</body>
</html>