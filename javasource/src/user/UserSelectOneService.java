package user;

import static user.JdbcUtil.*;

import java.sql.Connection;

public class UserSelectOneService {
	public UserVO getUser(int no) {
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		UserVO vo = dao.selectOne(no);
		close(con);
		return vo;
	
	}
}
