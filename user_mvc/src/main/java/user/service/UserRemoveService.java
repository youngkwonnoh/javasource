package user.service;

import java.sql.Connection;

import user.persistence.UserDAO;

import static user.persistence.JDBCUtil.*;

public class UserRemoveService {
	public boolean delete(int no) {
		boolean deleteFlage = false;
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		int result = dao.remove(no);
		
		if(result > 0) {
			deleteFlage = true;
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		return deleteFlage;
	}
}
