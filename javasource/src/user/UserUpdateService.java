package user;

import static user.JdbcUtil.*;

import java.sql.Connection;

public class UserUpdateService {
	public boolean updateUser(String mobile, String addr, int no) {
		boolean isUpdate = false;
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		int result = dao.update(mobile, addr, no);
		
		if(result>0) {
			commit(con);
			isUpdate = true;
		} else {
			rollback(con);
		}	
		close(con);
		return isUpdate;
	}
	
}
