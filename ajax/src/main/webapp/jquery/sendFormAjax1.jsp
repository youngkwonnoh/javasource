<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// System.out.println(request.getParameter("id"));
		// System.out.println(request.getParameter("age"));
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String age = request.getParameter("age");
		
		if(id.isEmpty() || age.isEmpty()) {
			out.print("false");
		} else {
			out.print("true");
		}
		
	%>
</body>
</html>