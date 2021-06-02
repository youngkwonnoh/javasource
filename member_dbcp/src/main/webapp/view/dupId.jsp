<%@page import="member.persistence.JDBCUtil"%>
<%@page import="member.persistence.MemberDAO"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");


	// 중복 아이디 검사
	// out.print(userid);
	
	// db 작업
	Connection con = JDBCUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	int result = dao.checkId(userid); // result ==1 (중복)
			
	if(result > 0) {
		out.print("false"); // userid 사용불가
	} else {
		out.print("true");
	}
	
%>