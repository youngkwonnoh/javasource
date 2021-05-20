<%@page import="member.persistence.MemberDAO"%>
<%@page import="member.persistence.JDBCUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	String confirm_password = request.getParameter("confirm_password");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	
	MemberVO vo = new MemberVO(userid, password, name, gender, email);
	
	
	// db 작업
	
	Connection con = JDBCUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	int result = dao.insert(vo);
	// 성공 - commit / loginForm.jsp
	if(result > 0) {
		JDBCUtil.commit(con);
		response.sendRedirect("loginForm.jsp");
	} else {
		JDBCUtil.rollback(con);
		response.sendRedirect("joinForm.jsp");
	}
	
	// 실패 - rollback / joinForm.jsp
	
	
%>
