package board.service;

import java.sql.Connection;

import board.domain.BoardVO;
import board.persistence.BoardDAO;

import static board.persistence.JDBCUtil.*;
public class BoardUpdateService {
	// update()
	public boolean update(BoardVO vo) {
		boolean updateFlag = false;
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		int result = dao.update(vo);
		
		if(result > 0) {
			commit(con);
			updateFlag = true;
		} else {
			rollback(con);
		}
		close(con);
		return updateFlag;
	}
}
