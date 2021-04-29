package emp;

import static emp.JdbcUtil.*;

import java.sql.Connection;

public class EmpSelectOneService {
	public EmpVO getEmp(int empno) {
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		EmpVO vo = dao.selectOne(empno);
		
		return vo;
	}
}
