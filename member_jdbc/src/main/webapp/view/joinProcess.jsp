<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	String confirm_password = request.getParameter("confirm_password");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	
	
	// db 작업
	
	// 성공 - commit / loginForm.jsp
	// 실패 - rollback / joinForm.jsp
	
	
%>
