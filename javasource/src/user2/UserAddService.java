package user2;

import static user.JdbcUtil.*;
import java.sql.Connection;


public class UserAddService {
	// 비즈니스 로직을 처리하는 클래스
	// 데이터베이스 작업 호풀
	
	public boolean add(String userName, int birthYear, String addr, String mobile) {
		boolean isAdd =  false;
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		int result = dao.insert(userName, birthYear, addr, mobile);
		if(result>0) {
			commit(con);
			isAdd = true;
		} else {
			rollback(con);
		}
		
		return isAdd;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
