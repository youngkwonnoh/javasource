package sequence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	// jdbc 드라이버 로드 / 연결시도 / sql문 전송 / sql문 실행 / 결과 받기 / 결과 리턴
	
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "shop";
			String password = "12345";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	// insert
	public boolean insert(String userName) {
		boolean insertFlag = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			String sql = "insert into member(userNo, userName) values(member_seq.nextval, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			int result = pstmt.executeUpdate();
			if(result>0) {
				insertFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return insertFlag;
	}
	
	//
	
	// list
	public List<MemberVO> getList() {
		String sql = "select * from member";
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setUserNo(rs.getInt("userNo"));
				vo.setUserName(rs.getString("userName"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	public MemberVO getRow(int userNo) {
		String sql = "select * from member where userNo=?";
		
		MemberVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				// vo = new MemberVO(rs.getInt("userNo"), rs.getString("userName"));
				
//				userNo = rs.getInt("userNo");
//				String userName = rs.getString("userName");
//				vo = new MemberVO(userNo, userName);
				
				vo = new MemberVO();
				vo.setUserNo(rs.getInt("userNo"));
				vo.setUserName(rs.getString("userName"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return vo;
	}
}
