package emp2;

import static emp.JdbcUtil.*;
import java.sql.Connection;

public class EmpInsertService {
	public boolean empInsert(EmpVO vo) {
		boolean isInsert = false;
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		int result = dao.insert(vo);
		if(result>0) {
			commit(con);
			isInsert = true;
		} else {
			rollback(con);
		}
		close(con);
		
		return isInsert;
	}
	
}
