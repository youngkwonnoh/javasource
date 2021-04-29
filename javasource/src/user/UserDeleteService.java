package user;

import static user.JdbcUtil.*;

import java.sql.Connection;

public class UserDeleteService {
	public boolean removeUser(int no) {
		
		boolean isDelete = false;
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		int result = dao.delete(no);
		if(result>0) {
			commit(con);
			isDelete = true;
		} else {
			rollback(con);
		}
		close(con);
		return isDelete;
	}
	
	
}
