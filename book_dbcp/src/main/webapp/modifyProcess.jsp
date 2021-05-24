<%@page import="book.persistence.BookDAO"%>
<%@page import="book.persistence.JDBCUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int code = Integer.parseInt(request.getParameter("code"));
	int price = Integer.parseInt(request.getParameter("price"));

	Connection con = JDBCUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	
	int result = dao.update(code, price);
	
	if(result > 0) {
		JDBCUtil.commit(con);
		response.sendRedirect("listProcess.jsp");
	} else {
		JDBCUtil.rollback(con);
		response.sendRedirect("index.jsp");
	}
	JDBCUtil.close(con);
%>