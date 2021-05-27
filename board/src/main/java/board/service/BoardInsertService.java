package board.service;

import java.sql.Connection;

import board.persistence.BoardDAO;
import static board.persistence.JDBCUtil.*;
import board.domain.BoardVO;

public class BoardInsertService {
	public boolean insertArticle(BoardVO vo) {
		boolean insertFlag = false;
		
		//dao 작업
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		int result = dao.insert(vo);
		
		if(result > 0) {
			commit(con);
			insertFlag = true;
		} else {
			rollback(con);
		}
		close(con);
		return insertFlag;
	}
}
