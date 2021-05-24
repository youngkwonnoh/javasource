package user.service;

import java.sql.Connection;

import user.domain.UserVO;
import user.persistence.UserDAO;

import static user.persistence.JDBCUtil.*;

public class UserViewService {
	public UserVO select(int no) {
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		UserVO vo = dao.getRow(no);
		
		close(con);
		return vo;
	}
	
}
