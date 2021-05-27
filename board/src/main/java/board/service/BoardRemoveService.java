package board.service;

import java.sql.Connection;

import board.persistence.BoardDAO;

import static board.persistence.JDBCUtil.*;
public class BoardRemoveService {
	public boolean delete(int bno, String password) {
		boolean deleteFlag = false;

		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		int result = dao.delete(bno, password);
		
		if(result > 0) {
			commit(con);
			deleteFlag = true;
		} else {
			rollback(con);
		}
		close(con);
		return deleteFlag;
	}
}
