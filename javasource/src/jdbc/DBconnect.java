package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			
			// 드라이버 로드
			// "oracle.jdbc.OracleDriver" => 예전 이름
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 데이터베이스 연결을 위한 문자열 생성
			// localhost (본인 컴퓨터) == 127.0.0.1
			// 1521 : 포트 번호
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			con = DriverManager.getConnection(url, user, password);
			if(con != null) {
				System.out.println("연결되었습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}

}
