<%@page import="book.domain.BookVO"%>
<%@page import="java.util.List"%>
<%@page import="book.persistence.BookDAO"%>
<%@page import="book.persistence.JDBCUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 사용자로부터 정보 가져온 후 vo에 담기
	request.setCharacterEncoding("utf-8");
	
	BookVO vo = new BookVO();
	vo.setCode(Integer.parseInt(request.getParameter("code")));
	vo.setTitle(request.getParameter("title"));
	vo.setWriter(request.getParameter("writer"));
	vo.setPrice(Integer.parseInt(request.getParameter("price")));
	
	Connection con = JDBCUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	
	int result = dao.insert(vo);
	
	if(result > 0) {
		JDBCUtil.commit(con);
		response.sendRedirect("listProcess.jsp");
	} else {
		JDBCUtil.rollback(con);
		response.sendRedirect("index.jsp");
	}
	JDBCUtil.close(con);
%>