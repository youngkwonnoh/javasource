<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// jdbc
	Connection con = null;
	try {
		// 드라이버 로드
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "javadb";
		String password = "12345";
		
		con = DriverManager.getConnection(url, user, password);
		
		if(con!=null)
			out.print("연결되었습니다.");
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

%>