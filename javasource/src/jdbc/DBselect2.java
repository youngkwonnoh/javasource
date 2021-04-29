package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBselect2 {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		
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
				
				// emp 테이블 안에 있는 내용 가져오기
				String sql = "select * from emp where deptno=10";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				
				System.out.println("empno\t ename\t job\t mgr\t hiredate\t sal\t comm\t deptno\t");
				while(rs.next()) {
					
					// 열번호를 숫자로 나타내면 알아서 찍어와준다.
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
					System.out.print(rs.getString(5) + "\t");
					System.out.print(rs.getInt(6) + "\t");
					System.out.print(rs.getInt(7) + "\t");
					System.out.print(rs.getInt(8) + "\t");
					System.out.println();
					
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}

}
