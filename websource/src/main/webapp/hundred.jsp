<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jsp에서 자바코드 사용하기 -->
<%-- jsp에서 자바코드 사용하기 --%>
<%
	// 자바 코드 들어오는 곳
	int total = 0;

	for(int i=0; i<101; i++) {
		total += i;
	}
	
	out.print(total);
%>
</body>
</html>