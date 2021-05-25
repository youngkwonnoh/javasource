package member.service;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

import member.domain.MemberVO;
import member.persistence.MemberDAO;
public class MemberJoinService {
	public boolean register(MemberVO vo) {
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		boolean insertFlag = false;
		int result = dao.insert(vo);
		
		if(result > 0) {
			insertFlag = true;
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		return insertFlag;
	}
	
}
