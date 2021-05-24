<%@page import="member.persistence.MemberDAO"%>
<%@page import="member.persistence.JDBCUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// leaveForm에서 넘기는 값 가져오기
	String userid = request.getParameter("userid");
	String currentPassword = request.getParameter("current_password");
	// db작업
	Connection con = JDBCUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	int result = dao.remove(userid, currentPassword);
		
	// 작업 결과에 따라서 성공이면 - 세션해제 / commit / index.jsp
	// 실패라면 = rollback = leaverForm.jsp
	if(result > 0) {
		session.removeAttribute("loginVO");
		JDBCUtil.commit(con);
		response.sendRedirect("../index.jsp");
	} else {
		JDBCUtil.rollback(con);
		response.sendRedirect("leaveform.jsp");
	}
	JDBCUtil.close(con);
	
%>