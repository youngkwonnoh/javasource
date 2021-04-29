package emp2;

import static emp.JdbcUtil.*;

import java.sql.Connection;

public class EmpDeleteService {
	public boolean empDelete(int empno, String ename) {
		boolean isDelete = false;
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		int result = dao.delete(empno, ename);
		
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
