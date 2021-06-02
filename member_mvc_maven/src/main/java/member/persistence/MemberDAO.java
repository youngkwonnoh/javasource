package member.persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.domain.MemberVO;
import static member.persistence.JDBCUtil.*;

public class MemberDAO {
	// 회원가입(C), 로그인(R), 회원정보수정(U), 회원탈퇴(D)
	// DML(UPDATE, DELETE, INSERT) / SELECT(서브쿼리, 조인)
	
	private Connection con;
	
	public MemberDAO(Connection con) {
		this.con = con;
	}

	public MemberVO isLogin(String userid, String currentPassword) {
		// 로그인이 성공하면, 사용자의 아이디와 이름을 MemberVO에 담기
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try {
			String sql = "select userid, name from memberTBL where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, currentPassword);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new MemberVO();
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}
	// 회원 탈퇴
	public int remove(String userid, String currentPassword) {
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from memberTBL where userid = ? and password = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, currentPassword);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}
	
	// 회원 비밀번호 수정
	public int update(String userid, String currentPassword, String changePassword) {
		// userid와 currentPassword가 일치하면 현재 비밀번호를 새로운 비밀번호로 변경
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update memberTBL set password=? where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, changePassword);
			pstmt.setString(2, userid);
			pstmt.setString(3, currentPassword);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	// 회원가입
	public int insert(MemberVO vo) {
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into memberTBL(userid, password, name, gender, email)";
			sql += "values(?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getEmail());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	// 중복 아이디 검사
	public int checkId(String userid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			String sql = "select userid from memberTBL where userid=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return result;
	}
}
