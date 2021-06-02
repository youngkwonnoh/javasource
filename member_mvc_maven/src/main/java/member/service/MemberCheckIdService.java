package member.service;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

import member.persistence.MemberDAO;

public class MemberCheckIdService {
	public boolean dupId(String userid) {
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		boolean dupFlag = true;
		
		int result = dao.checkId(userid);
		
		if(result > 0) { // 아이디 사용불가
			dupFlag = false;
		}
		close(con);
		
		return dupFlag;
	}
}
