package user2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static user.JdbcUtil.*;

public class UserDAO {
	// select => 조건에 맞는 레코드를 가져오기
	private Connection con;
	
	public UserDAO(Connection con) {
		this.con = con;
	}
		private PreparedStatement pstmt;
		private ResultSet rs;
	
	// select * from userTBL where n=1 =>
	public UserVO selectOne(int no) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO vo = null;
		String sql = "select * from userTBL where no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setUserName(rs.getString("username"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
				close(rs);
				close(pstmt);
				close(con);
		} 
		return vo;
		
	}
	
	// select * from userTBL where username like ~~ => 여러개
	// select => 전체 레코드 가져오기
	public List<UserVO> getList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from userTBL";
		List<UserVO> list = new ArrayList<UserVO>();
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setUserName(rs.getString("username"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
				close(rs);
				close(pstmt);
		} 
		return list;
	}
	
	// update = 전화번호, 주소
	// update userTBL set mobile = ?, addr = ? where = ?
	public int update(String mobile, String addr, int no) {
		PreparedStatement pstmt = null;
		String sql = "update userTBL set mobile = ?, addr = ? where no = ?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mobile);
			pstmt.setString(2, addr);
			pstmt.setInt(3, no);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	// delete
	// no 값을 받아서 삭제
	public int delete(int no) {
		boolean deleteFlag = false;
		int result=  0;
		String sql = "delete from userTBL where no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
//			if(result>0) {
//				deleteFlag = true;
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	// insert
	// INSERT INTO userTBL(no, userName, birthYear, addr, mobile)
	// VALUES(user_seq.nextval, '송중기' 2004, '부산시', '01012381238')
	public int insert(String userName, int birthYear, String addr, String mobile) {
	// public int insert(UserVO vo) {
		String sql = "insert into userTBL(no, userName, birthYear, addr, mobile)";
		sql += "VALUES(user_seq.nextval, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName); // (1, vo.getUserName())
			pstmt.setInt(2, birthYear); // (2, vo.getBirtgYear())
			pstmt.setString(3, addr); // (3, vo.getAddr())
			pstmt.setString(4, mobile); // (4, vo.getMobile))
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
}
