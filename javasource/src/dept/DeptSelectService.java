package dept;

import java.sql.Connection;
import java.util.List;
import static emp.JdbcUtil.*;

public class DeptSelectService {
	public List<DeptVO> getList() {
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		List<DeptVO> list = dao.deptSelect();
		
		close(con);
		return list;
	}
}
