package dept2;

import static emp.JdbcUtil.*;

import java.sql.Connection;

public class DeptSelectOneService {
	public DeptVO getRow(int deptno) {
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		
		DeptVO vo = dao.selectOne(deptno);
		
		close(con);
		
		return vo;
	}
}
