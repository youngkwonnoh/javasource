package dept2;

import static emp.JdbcUtil.*;

import java.sql.Connection;

public class DeptUpdateService {
	public boolean deptUpdate (String loc, int deptno) {
		
		boolean isUpdate = false;
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		
		if(dao.update(loc, deptno)) {
			commit(con);
			isUpdate = true;
		} else {
			rollback(con);
		}
		
		close(con);
		return isUpdate;
	}

}
