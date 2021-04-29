package dept2;

import static emp.JdbcUtil.*;

import java.sql.Connection;

public class DeptInsertService {
	public boolean deptInsert(DeptVO vo) {
		boolean isInsert = false;
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		
		if(dao.insert(vo)) {
			commit(con);
			isInsert = true;
		} else {
			rollback(con);
		
		}
		close(con);
		
		return isInsert;
	}
	
	
}
