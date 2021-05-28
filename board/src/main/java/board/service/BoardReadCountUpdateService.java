package board.service;

import static board.persistence.JDBCUtil.*;

import java.sql.Connection;

import board.persistence.BoardDAO;

public class BoardReadCountUpdateService {
	public boolean readCountUpdate(int bno) {
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		boolean countFlag = false;
		
		// 조회수 업데이트
		int result = dao.readCountUpdate(bno);
		if(result > 0) {
			commit(con);
			countFlag = true;
		} else {
			rollback(con);
		}
		close(con);
		return countFlag;
	}
}
