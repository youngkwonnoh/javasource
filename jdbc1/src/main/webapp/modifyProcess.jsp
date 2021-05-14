<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// modify.jsp 넘긴 값 가져오기(no, addr, mobile)
	request.setCharacterEncoding("utf-8");

	int no = Integer.parseInt(request.getParameter("no"));
	String addr = request.getParameter("addr");
	String mobile = request.getParameter("mobile");
	
	// db
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		// 드라이버 로드
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "javadb";
		String password = "12345";
		con = DriverManager.getConnection(url, user, password);
		String sql = "update usertbl set addr=?, mobile=? where no=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, addr);
		pstmt.setString(2, mobile);
		pstmt.setInt(3, no);
		
		int result = pstmt.executeUpdate();
		// 결과에 따라 이동
		if(result>0) {
		// 입력 성공 
			response.sendRedirect("selectone.jsp?no=" + no);
		} else {
		//입력 실패 => modify.jsp
			response.sendRedirect("modify.jsp?no=" + no);
		}
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			pstmt.close();
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

%>