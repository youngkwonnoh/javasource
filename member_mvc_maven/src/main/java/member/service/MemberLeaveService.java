package member.service;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

import member.persistence.MemberDAO;

public class MemberLeaveService {
	public boolean leave(String userid, String currentPassword) {
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		int result = dao.remove(userid, currentPassword);
		
		boolean removeFlag = false;
		
		if(result > 0) {
			removeFlag = true;
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		return removeFlag;
	}
}
