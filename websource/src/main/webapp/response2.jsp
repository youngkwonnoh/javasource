<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%	
		System.out.println(request.getParameter("userid"));
		System.out.println(request.getParameter("password"));
		response.sendRedirect("send.jsp");
	%>
