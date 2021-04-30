package emp2;

import static emp.JdbcUtil.*;

import java.sql.Connection;

public class EmpSelectOneService {
	public EmpVO getEmp(String ename) {
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		
		EmpVO vo = dao.selectOne(ename);
		
		return vo;
	}
}
